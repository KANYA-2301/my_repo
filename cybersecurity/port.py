# -*- coding: utf-8 -*-
"""Untitled35.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1nCTlNnC4ric8_2JUjRffQJjdoCp98pwO
"""

import socket

def check_open_ports(host, port_range):
    open_ports = []

    # Loop through the specified port range
    for port in range(port_range[0], port_range[1] + 1):
        # Create a socket object
        sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        sock.settimeout(1)  # Set a timeout of 1 second

        # Try connecting to the port
        result = sock.connect_ex((host, port))

        # If result is 0, the port is open
        if result == 0:
            print(f"Port {port} is open")
            open_ports.append(port)
        else:
            print(f"Port {port} is closed")

        # Close the socket
        sock.close()

    return open_ports

# Example usage
host = "192.168.56.1"  # You can replace this with the target IP or hostname
port_range = (1, 23)  # Range of ports to scan (e.g., 1-1024)

open_ports = check_open_ports(host, port_range)

if open_ports:
    print("\nOpen ports:", open_ports)
else:
    print("\nNo open ports found in the given range.")
