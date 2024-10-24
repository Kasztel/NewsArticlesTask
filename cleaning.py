import json

with open('combined_FORWORK.json', 'r') as f:
    data = json.load(f)

seen_titles = set()
cleaned_data = []

for item in data:
    title = item.get('title')  # Get the title attribute
    if title not in seen_titles:  # Check if the title has not been seen
        seen_titles.add(title)  # Add the title to the set
        cleaned_data.append(item)  # Add the item to the cleaned list

with open('cleaned_file.json', 'w') as f:
    json.dump(cleaned_data, f, indent=4)

print(f"Cleaned data saved to 'cleaned_file.json'")