# Emirates E-commerce UI Testing

## Overview
This repository contains automated tests for the Emirates e-commerce platform. The test suite focuses on validating shopping cart functionality and currency conversion features using Selenium WebDriver and RestAssured.

## Project Repository
[emirates-ui-e2e-test](https://github.com/redJavaMan/emirates-ui-e2e-test.git)

## Tech Stack
- Java
- Selenium WebDriver
- RestAssured
- TestNG
- Maven
- Allure Reporting Framework

## Prerequisites
- Java JDK 11 or higher
- Maven 3.8.x or higher
- Chrome/Firefox browser
- Allure command line tool (for report generation)

## Project Structure
```
src
├── main
│   └── java
│       └── com
│           └── emirates
│               ├── pages
│               │   └── [Page Objects]
│               └── utils
│                   └── [Utility Classes]
└── test
    └── java
        └── com
            └── emirates
                └── test
                    ├── AddToCartTest.java
                    └── CurrencyDropDownTest.java
```

## Installation & Setup
```bash
# Clone the repository
git clone https://github.com/redJavaMan/emirates-ui-e2e-test.git

# Navigate to project directory
cd emirates-ui-e2e-test

# Install dependencies and run tests
mvn clean test
```

## Test Configuration
```xml
<?xml version="1.0" encoding="UTF-8"?>
<suite name="Emirates" parallel="tests" thread-count="2">
    <listeners>
        <listener class-name="io.qameta.allure.testng.AllureTestNg"/>
    </listeners>
    <test name="Test Group 1">
        <classes>
            <class name="com.emirates.test.AddToCartTest" />
            <class name="com.emirates.test.CurrencyDropDownTest" />
        </classes>
    </test>
</suite>
```

## Test Cases

### Shopping Cart Tests
- Add items to cart
- Verify cart counter
- Validate cart totals
- Check item details in cart

### Currency Tests
- Currency dropdown functionality
- Currency conversion validation
- Price display updates
- Exchange rate verification

## Running Tests
```bash
# Run all tests with default configuration
mvn clean test

# Run tests with Allure reporting
mvn clean test allure:serve

# Generate Allure report
allure generate target/allure-results --clean -o target/allure-report
```

## Parallel Execution
The test suite is configured to run in parallel with a thread count of 2. This is configured in the testng.xml file:
- Parallel execution mode: `parallel="tests"`
- Thread count: `thread-count="2"`

## Reporting
The project uses Allure for test reporting. To view the reports:

1. Run tests with Allure:
```bash
mvn clean test
```

2. Generate and open the report:
```bash
allure serve target/allure-results
```

## Key Features
- Page Object Model implementation
- Parallel test execution
- Allure reporting integration
- Cross-browser testing support
- API validation for currency conversion
- Screenshot capture on test failure

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
