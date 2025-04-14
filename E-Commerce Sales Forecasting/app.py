import streamlit as st
import pandas as pd
import numpy as np
import plotly.express as px
from sklearn.model_selection import train_test_split
from sklearn.linear_model import Ridge, Lasso
from sklearn.metrics import mean_squared_error, r2_score
import base64
# Function to set background image
def set_background(image_file):
    with open(image_file, "rb") as file:
        encoded_bg = base64.b64encode(file.read()).decode()
    st.markdown(
        f"""
        <style>
            .stApp {{
                background-image: url("data:image/png;base64,{encoded_bg}");
                background-size:cover;
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
        </style>
        """,
        unsafe_allow_html=True
    )

# Set background image (replace 'background.jpg' with your local file)
set_background(r"D:\E-Commerce_Sales_Forecasting\baground.jpg")

# Title
st.title('ForecasterX')

# File uploader
uploaded_train = st.file_uploader("Upload Train Dataset", type=["csv"])
uploaded_features = st.file_uploader("Upload Features Dataset", type=["csv"])
uploaded_stores = st.file_uploader("Upload Stores Dataset", type=["csv"])

if uploaded_train and uploaded_features and uploaded_stores:
    train_df = pd.read_csv(uploaded_train)
    features_df = pd.read_csv(uploaded_features)
    stores_df = pd.read_csv(uploaded_stores)

    st.subheader("Preview of Data")
    st.write(train_df.head())
    st.write(features_df.head())
    st.write(stores_df.head())

    # Merge datasets
    df = train_df.merge(features_df, on=["Store", "Date"], how="left")
    df = df.merge(stores_df, on=["Store"], how="left")

    # Data preprocessing
    df.dropna(inplace=True)

    # Feature and target selection
    X = df[['Temperature', 'Fuel_Price', 'CPI', 'Unemployment']]
    y = df['Weekly_Sales']

    # Train-test split
    X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

    # Model selection
    model_type = st.selectbox("Select Model", ("Ridge", "Lasso"))

    if model_type == "Ridge":
        model = Ridge()
    else:
        model = Lasso()

    if st.button("Train Model"):
        model.fit(X_train, y_train)
        y_pred = model.predict(X_test)

        # Metrics
        mse = mean_squared_error(y_test, y_pred)
        r2 = r2_score(y_test, y_pred)

        st.write(f"Mean Squared Error: {mse:.2f}")
        st.write(f"R-squared: {r2:.2f}")

        # Plot
        fig = px.scatter(x=y_test, y=y_pred, labels={'x': 'Actual', 'y': 'Predicted'}, title='Actual vs Predicted')
        st.plotly_chart(fig)

# Run: streamlit run app.py
