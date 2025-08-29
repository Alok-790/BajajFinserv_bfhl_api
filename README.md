# BFHL Spring Boot API 🚀

A Spring Boot REST API built for the **Bajaj Finserv Health Limited (BFHL) assignment**.  
The API processes a JSON array of strings and returns categorized outputs: odd numbers, even numbers, alphabets, special characters, sum of numbers, and a concatenated string with alternating caps (reverse order).

---

## 📌 Features
- **POST `/bfhl`**
  - Accepts a JSON body with a key `data` (array of strings).
  - Returns:
    - `is_success` (boolean)
    - `user_id` (format: `full_name_ddmmyyyy`)
    - `email`
    - `roll_number`
    - `odd_numbers` (array of strings)
    - `even_numbers` (array of strings)
    - `alphabets` (uppercase array)
    - `special_characters` (array of strings)
    - `sum` (string, sum of numbers)
    - `concat_string` (reversed + alternating caps string from all letters)

---

## 🏃 Run Locally

### 1. Clone the repo
```bash
git clone https://github.com/Alok-790/bfhl-springboot.git
cd bfhl-springboot


The API is hosted on Render:
👉 https://bajajfinserv-bfhl-api-1.onrender.com/bfhl


---
output using local port (Postman)

<img width="1168" height="853" alt="image" src="https://github.com/user-attachments/assets/35ab1d81-88ec-4f6b-bdaf-90687e545f33" />

<img width="984" height="242" alt="image" src="https://github.com/user-attachments/assets/ea24d5c2-5573-4b43-8c26-edbe487f33dd" />
---
---
output using the deployed project on render (Postman)

<img width="1622" height="1007" alt="image" src="https://github.com/user-attachments/assets/a41c918f-ece3-41bf-a6da-68fc2191f3a2" />

<img width="1125" height="406" alt="image" src="https://github.com/user-attachments/assets/23a92b6e-5d80-4545-9afc-4f8e7bd4d6ca" />
---
