
# 💰 Expensia

Expensia is a full-stack Expense Management Application that allows users to track their income and expenses securely, view financial summaries, and manage their personal finances with ease.

## 🔧 Tech Stack

- **Frontend**: React + TypeScript + Bootstrap
- **Backend**: Spring Boot + Spring Security + JPA + MySQL
- **Authentication**: JWT-based login system
- **API Testing**: Postman
- **Build Tools**: Maven

---

## 📦 Features

- 🔐 User Registration, Login, and Logout (JWT Auth)
- 📊 Dashboard showing total income, expenses, and balance
- 🧾 Add, Edit, Delete, and View expenses
- 🗂️ Categorize expenses and filter by date/category
- 📈 Responsive UI with Bootstrap and chart visualization
- ✅ Protected routes and secure API access

---

## 🚀 How to Run Locally

### ✅ Backend (Spring Boot)
1. Navigate to the backend folder:
   ```bash
   cd RestApi
   ```
2. Add your DB credentials in `application.properties`
3. Run:
   ```bash
   mvn spring-boot:run
   ```

### ✅ Frontend (React)
1. Navigate to the frontend folder:
   ```bash
   cd "Expensia Front/WebApp"
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Run the app:
   ```bash
   npm start
   ```

---

## 🔐 Environment Variables

### Backend:
Configure your MySQL and JWT secret in `application.properties`:
```
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
jwt.secret=YOUR_SECRET_KEY
```

### Frontend:
Create a `.env` file in the frontend root:
```
REACT_APP_API_URL=http://localhost:8080
```

---

## 🧪 API Testing (Postman)

You can find the organized Postman collection in the `Postman/` folder (if available). It contains:

- Auth APIs
- Expense CRUD
- Dashboard Summary
- Filters by category/date

---

## 🧑‍💻 Folder Structure

```
📁 Expensia
├── 📁 RestApi                  # Spring Boot Backend
├── 📁 Expensia Front/WebApp   # React Frontend
└── 📄 README.md
```

---

## 📌 Future Improvements

- Export expenses to CSV
- Add income tracking
- Dark mode toggle
- Notifications or email reports

---

## 🧠 Attribution

This project was built while following the course:
**"Java Full Stack: React and Spring Boot 3 [Expense App]"**  
by **Bushan Sirgur**.

All code in this repository was written by me as part of the learning journey along with my own modifications.

---

## 📄 License

This project is licensed under the MIT License.
