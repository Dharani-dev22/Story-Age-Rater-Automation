# Story Age-Rater Selenium Automation

An automated testing script built with Java and Selenium WebDriver to validate the UI and logic of a local web-based Story Age-Rater application. 

## 📸 Project Screenshots

<p align="center">
  <img width="1352" height="447" alt="Terminal Output" src="https://github.com/user-attachments/assets/c5fe4bb1-bfd7-459a-aca1-bba1d46cfd78" />
</p>

<p align="center">
  <img width="1297" height="1107" alt="Test Case 1 - Toddler Story" src="https://github.com/user-attachments/assets/6abc7822-73f2-45ee-b465-98c0c58fb461" />
</p>

<p align="center">
  <img width="1297" height="1107" alt="Test Case 2 - Complex Story" src="https://github.com/user-attachments/assets/d9d15da0-3ff2-4a20-a1df-f4e250087a17" />
</p>


## ✨ Features
* **Local File Testing:** Demonstrates how to configure Selenium to navigate to and test local `file:///` HTML documents.
* **Automated UI Interaction:** Locates text inputs and buttons using DOM IDs, inputs test data, and triggers JavaScript functions.
* **Dynamic Waiting:** Implements `WebDriverWait` (Explicit Waits) to ensure elements are present in the DOM before interacting, preventing race conditions.
* **Result Validation:** Reads the dynamic text output from the DOM and validates it against expected test conditions.

## 🛠️ Tech Stack
* **Language:** Java 21
* **Automation Framework:** Selenium WebDriver (v4.18.1)
* **Build Tool:** Apache Maven
* **Frontend:** HTML5, JavaScript (Target Application)

## 🧪 Test Cases Automated
1. **Toddler Story Verification:** Inputs a short string ("A tiny seed grew fast") and asserts that the JavaScript logic correctly outputs **"Ages 4-6"**.
2. **Complex Story Verification:** Clears the input, submits a complex string ("The automated software testing curriculum requires rigorous validation protocols."), and asserts that the application correctly outputs **"Too Complex"**.

## 🚀 How to Run Locally

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git](https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git)
   ```

2. **Open the project:**
   Open the `story-test-rater` folder in your preferred Java IDE (such as VS Code, IntelliJ, or Eclipse).

3. **Update the file path:**
   Open `StoryAnalyzerTest.java` and update line 21 to point to the absolute path of `story_rater.html` on your local machine:
   ```java
   driver.get("file:///C:/YOUR/PATH/TO/story_rater.html");
   ```

4. **Execute the script:**
   Run the `StoryAnalyzerTest.java` file as a standard Java Application.
