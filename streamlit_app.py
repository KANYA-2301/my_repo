import streamlit as st
import numpy as np
import tensorflow as tf
from tensorflow.keras.models import load_model
from tensorflow.keras.layers import BatchNormalization
from PIL import Image
import base64
from io import BytesIO

# Function to set background image
def set_background(image_file):
    with open(image_file, "rb") as file:
        encoded_bg = base64.b64encode(file.read()).decode()
    st.markdown(
        f"""
        <style>
            .stApp {{
                background-image: url("data:image/png;base64,{encoded_bg}");
                background-size: cover;
                background-repeat: no-repeat;
                background-attachment: fixed;
            }}
            /* Styling for inputs and buttons */
            .stTextInput, .stButton, .stFileUploader {{
                background-color: rgba(255, 255, 255, 0.8);
                border-radius: 10px;
                padding: 10px;
            }}
            /* Styling for headings */
            h1, h2, h3, h4, h5, h6 {{
                color: #ffffff;
                text-shadow: 2px 2px 4px rgba(0,0,0,0.6);
            }}
            /* Styling for prediction result */
            .predicted-leaf {{
                font-size: 24px;
                font-weight: bold;
                color: #000000;
                margin-top: 10px;
                text-align: center;
            }}
            /* Center uploaded image */
            .image-container {{
                display: flex;
                justify-content: center;
                align-items: center;
                margin-top: 10px;
            }}
        </style>
        """,
        unsafe_allow_html=True
    )

# Set background image (replace with your image path)
set_background("D:\\Medicinal Leaves\\plant1.jpg")

# Class labels
CLASS_NAMES = {
    0: "Aloe Vera", 1: "Amla", 2: "Amruthaballi", 3: "Arali", 4: "Asthma Weed",
    5: "Badipala", 6: "Balloon Vine", 7: "Bamboo", 8: "Beans", 9: "Betel",
    10: "Brahmi", 11: "Bhringaraja", 12: "Caricature", 13: "Castor", 14: "Catharanthus",
    15: "Chakte", 16: "Chilly", 17: "Citron Lime", 18: "Coffee", 19: "Common Rue",
    20: "Coriander", 21: "Curry", 22: "Doddpathre", 23: "Drumstick", 24: "Ekka",
    25: "Eucalyptus", 26: "Ganigale", 27: "Ganike", 28: "Gasagase", 29: "Ginger",
    30: "Global Amarnath", 31: "Guava", 32: "Henna", 33: "Hibiscus", 34: "Honge",
    35: "Insulin", 36: "Jackfruit", 37: "Jasmine", 38: "Kambajala", 39: "Kasambruga",
    40: "Kohlrabi", 41: "Lantana", 42: "Lemon", 43: "Lemongrass", 44: "Malabar Nut",
    45: "Malabar Spinach", 46: "Mango", 47: "Marigold", 48: "Mint", 49: "Neem",
    50: "Nelavembu", 51: "Nerale", 52: "Nooni", 53: "Onion", 54: "Padri", 55: "Palak (Spinach)",
    56: "Papaya", 57: "Padri Onion", 58: "Palak (Spinach) Padri", 59: "Papaya Palak (Spinach)", 60: "Parijatha Papaya",
    61: "Pea Parijatha", 62: "Parijatha", 63: "Pomegranate Pepper", 64: "Pumpkin Pomegranate", 65: "Pumpkin",
    66: "Radish", 67: "Rose", 68: "Sampige", 69: "Sapota", 70: "Seetha Ashoka",
    71: "Seethapala", 72: "Spinach", 73: "Tamarind", 74: "Taro", 75: "Tecoma",
    76: "Ashoka Thumbe", 77: "Camphor Tomato", 78: "Tulsi", 79: "Kepala"
}

# Load the TensorFlow model
@st.cache_resource
def load_keras_model():
    try:
        model = load_model("Model_Mobilenet.h5", custom_objects={"BatchNormalization": BatchNormalization})
        return model
    except Exception as e:
        st.error(f"Failed to load model: {e}")
        return None

model = load_keras_model()

# Streamlit UI
st.title("Deep Learning-Based Identification of Medicinal Plant Species with MobileNetV2")
st.write("Upload an image of a plant leaf for identification.")

# File uploader
uploaded_file = st.file_uploader("Choose an image...", type=["jpg", "png", "jpeg"])

if uploaded_file is not None:
    # Read file and store in memory
    file_bytes = BytesIO(uploaded_file.getvalue())
    image = Image.open(file_bytes).convert("RGB")

    # Convert to base64 for display
    buffered = BytesIO()
    image.save(buffered, format="PNG")
    img_str = base64.b64encode(buffered.getvalue()).decode()

    # Display the image at center
    st.markdown(
        f'<div class="image-container">'
        f'<img src="data:image/png;base64,{img_str}" '
        f'style="width: 300px; border-radius: 12px; box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);" />'
        f'</div>',
        unsafe_allow_html=True
    )

    # Preprocess image
    image = image.resize((224, 224))
    image_array = np.array(image) / 255.0
    image_array = np.expand_dims(image_array, axis=0)

    if model:
        # Get prediction
        prediction = model.predict(image_array)
        predicted_class = np.argmax(prediction)
        leaf_name = CLASS_NAMES.get(predicted_class, "Unknown Leaf")

        # Display result
        st.markdown(
            f'<div class="predicted-leaf">Predicted Leaf: {leaf_name}</div>',
            unsafe_allow_html=True
        )
    else:
        st.error("Model is not loaded. Please check for errors.")
