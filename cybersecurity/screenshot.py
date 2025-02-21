import pyautogui
import os
import datetime

def take_screenshot():
    # Get the desktop path
    desktop_path = os.path.join(os.path.expanduser("~"), "OneDrive\Desktop")

    # Ensure the desktop path exists
    if not os.path.exists(desktop_path):
        print(f"Desktop path not found: {desktop_path}")
        return

    # Create a filename with the current timestamp
    timestamp = datetime.datetime.now().strftime("%Y-%m-%d_%H-%M-%S")
    screenshot_filename = f"screenshot_{timestamp}.png"

    # Full path for saving the screenshot
    screenshot_path = os.path.join(desktop_path, screenshot_filename)

    try:
        # Take the screenshot
        screenshot = pyautogui.screenshot()

        # Save the screenshot to the specified path
        screenshot.save(screenshot_path)
        print(f"Screenshot saved at: {screenshot_path}")
    except Exception as e:
        print(f"An error occurred while saving the screenshot: {e}")

# Take a screenshot
take_screenshot()
