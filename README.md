# Student Course Registration Management

A Java desktop application for managing student course registration, built using **NetBeans** and **Swing GUI**.

---

## 📌 Main Features

### 1. Subject Management
- Display list of subjects (ID, name, number of lessons, type).
- Search subjects by:
  - Name
  - Number of lessons (range)
- Sort subject list:
  - By name (A–Z / Z–A)
  - By number of lessons (ascending / descending)
- Add / edit / delete subject entries.

![Subject Management](https://github.com/xNhatMinh/course-registration-management-app/blob/master/UI%20images/Subject%20Management.png)

---

### 2. Student Management
- Manage student information:
  - Student ID, Full name, Date of birth, Address, Email, Phone number, Class, Major, School year.
- Search students by:
  - Name
  - Student ID
  - Major
- Sort student list:
  - By name (A–Z / Z–A)
  - By student ID (ascending)

![Student Management](https://github.com/xNhatMinh/course-registration-management-app/blob/master/UI%20images/Student%20Management.png)

---

### 3. Registration Management
- Track students registering for subjects.
- Display:
  - Student ID, Name, Class, Subject ID, Subject name, Registration time.
- Search by:
  - Student name
  - Registration time (from–to)
- Sort registrations by student name.
- Add / delete registration records.

![Registration Management](https://github.com/xNhatMinh/course-registration-management-app/blob/master/UI%20images/Registration%20Management.png)

---

### 4. Class Division
- Organize students into course sections based on their registrations.
- Display:
  - Course section, Student ID, Name, Class, Subject ID, Subject name, Registration time.
- Feature to **automatically create course sections** from existing registrations.

![Class Division](https://github.com/xNhatMinh/course-registration-management-app/blob/master/UI%20images/Class%20division.png)

---

## 🛠 Technologies Used
- Java (JDK 8+)
- NetBeans IDE
- Swing (Java GUI)
- Data stored in `.DAT` files (no database required)

---

## 🚀 How to Run the Program

1. Open the project with NetBeans.
2. Locate and run the main class (`HomeFrm.java` or equivalent).
3. The graphical user interface will launch automatically.

---

## 👤 Author

- 📧 Email: *dnm7996@gmail.com*
- 📘 This project was developed as a course assignment or academic project.

---

## ⚠️ Notes

- Data is saved to local `.DAT` files. Ensure these files are present in the correct directory when running the app.
- No external database is required to operate this application.
