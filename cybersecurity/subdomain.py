import requests
import json
import re

def subdomain_enum(domain):
    # URL for the crt.sh Certificate Transparency log
    url = f"https://crt.sh/?q=%25.{domain}&output=json"
    
    try:
        response = requests.get(url)
        
        # Check if the request was successful
        if response.status_code == 200:
            subdomains = set()
            data = response.json()
            
            # Extract subdomains from the response data
            for entry in data:
                name_value = entry['name_value']
                # Split and clean the subdomain list
                subdomains.update(name_value.split("\n"))
            
            # Display the subdomains found
            print(f"Subdomains found for {domain}:")
            for subdomain in sorted(subdomains):
                print(subdomain)
        else:
            print(f"Failed to retrieve data from crt.sh: {response.status_code}")
    
    except Exception as e:
        print(f"An error occurred: {e}")

# Replace 'example.com' with the domain you want to enumerate
domain = "example.com"
subdomain_enum(domain)
