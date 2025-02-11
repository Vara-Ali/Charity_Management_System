# Charity Management System

## Overview

The Charity Management System is a JavaFX-based application designed to facilitate the management of charity operations. It supports multiple user roles, including Donors, Moderators, and Admins, each with specific functionalities tailored to their responsibilities. The system allows users to propose donations, manage cases, and oversee charity operations efficiently.

## Features

- **User Roles**: Supports Donor, Moderator, and Admin roles with distinct functionalities.
- **Donation Management**: Donors can propose donations and make contributions to active cases.
- **Case Management**: Moderators can add, verify, and delete cases pending approval.
- **Admin Control**: Admins can manage moderators and oversee the entire system.
- **Database Integration**: Uses MySQL for storing and retrieving data.
- **User Interface**: Built with JavaFX for a rich and interactive user experience.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- MySQL Database set up and running.
- JavaFX library for building the user interface.

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/charity-management-system.git
   cd charity-management-system
   ```

2. **Set Up Database**:
   - Ensure you have a MySQL database running.
   - Create the necessary database schema and tables as per the application's requirements.

3. **Configure Database Connection**:
   - Update the database connection details in the `MySQLHandler` class with your database credentials.

### Running the Application

1. **Compile the Code**:
   ```bash
   javac -cp path/to/javafx-sdk/lib --module-path path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml Main.java
   ```

2. **Run the Application**:
   ```bash
   java -cp path/to/javafx-sdk/lib --module-path path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml Main
   ```

## Usage

### Main Menu

Upon running the application, you will be presented with the main menu to select your role:

1. **Donor**: Log in or sign up to propose donations and contribute to active cases.
2. **Moderator**: Log in to manage cases, including adding new cases and verifying proposed cases.
3. **Admin**: Log in to manage moderators and oversee the system.

### Donor Operations

- **Propose Donation**: Donors can propose new donations by filling out the necessary details.
- **Make Donation**: Contribute to active cases by selecting a case and entering the donation amount.

### Moderator Operations

- **Add Case**: Moderators can add new cases that require donations.
- **Verify Case**: Verify proposed cases to make them active for donations.
- **Delete Case**: Remove cases that are no longer needed.

### Admin Operations

- **Manage Moderators**: Add or remove moderators to manage case operations.
- **Oversee System**: Monitor the overall operations of the charity system.

## Custom Exceptions

The application uses custom exceptions to handle invalid operations:

- **InvalidAccountException**: Thrown when an invalid account operation is attempted.
- **InvalidDonationException**: Thrown when an invalid donation operation is attempted.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.


## Contact

For any questions or suggestions, please contact varaali85@gmail.com
