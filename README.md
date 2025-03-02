# Emirates UI E2E Test Framework

## Overview
This repository contains an automated end-to-end testing framework for the Emirates Red website, built using Selenium WebDriver, TestNG, Rest Assured, and Java. The framework follows Page Object Model design pattern for maintainable test architecture and includes both UI and API testing capabilities.

## Tech Stack
- **Java 17**: Core programming language
- **Selenium WebDriver**: For browser automation
- **TestNG**: Test execution and reporting framework
- **Rest Assured**: For API testing and validation
- **Allure**: For comprehensive test reporting
- **Maven**: For project management and dependency resolution

## Features
- **Page Object Model (POM)**: Well-structured design pattern for maintainable test code
- **Parallel Test Execution**: Using TestNG for efficient test runs
- **Cross-Currency Validation**: Tests currency conversion functionality with API verification
- **Shopping Cart Validation**: End-to-end tests for product selection and cart functionality
- **Allure Reporting**: Detailed test execution reports with screenshots
- **API Integration**: Currency conversion API integration for validation

## Project Structure
```
├── src/
│   ├── main/
│   │   ├── java/com/emirates/
│   │   │   ├── pages/           # Page Object files
│   │   │   │   ├── Header.java           # Website header with currency options
│   │   │   │   ├── HomePage.java         # Main page functionality
│   │   │   │   ├── ProductListPage.java  # Product listing functionality
│   │   │   │   └── ProductPage.java      # Individual product page
│   │   │   └── utils/           # Utility functions
│   │   │       └── Utils.java            # Currency conversion utilities
│   ├── test/
│   │   ├── java/com/emirates/
│   │   │   ├── base/            # Test framework base
│   │   │   │   └── BaseTest.java        # Common test setup/teardown
│   │   │   └── test/            # Test classes
│   │   │       ├── AddToCartTest.java   # Shopping cart tests
│   │   │       └── CurrencyDropDownTest.java # Currency tests
├── pom.xml                      # Maven project configuration
└── testng.xml                   # TestNG execution configuration
```

## Prerequisites
- Java Development Kit (JDK) 17
- Maven 3.6 or higher
- Chrome browser (latest version)
- Internet connection for API testing

## Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/emirates-ui-e2e-test.git

# Navigate to project directory
cd emirates-ui-e2e-test

# Install dependencies
mvn clean install -DskipTests
```

## Running Tests

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=CurrencyDropDownTest

# Generate Allure report after test execution
mvn allure:report
```

## Test Scenarios

### Currency Conversion Test
- Validates that product prices correctly update when changing currency
- Uses currency conversion API to verify the accuracy of converted prices
- Handles different currency formats and symbols

### Add to Cart Test
- Navigates through product categories
- Selects specific products
- Validates product details
- Adds products to shopping cart

## Allure Reporting

This framework uses Allure for comprehensive test reporting. After test execution:

1. Generate the report:
```bash
mvn allure:report
```

2. Open the report (located in `target/site/allure-maven-plugin/index.html`)

## Configuration

The framework includes the following configurable elements:

- **Browser Selection**: Configured in `BaseTest.java` (currently set to Chrome)
- **Base URL**: Set in `BaseTest.java` for the application under test
- **Test Parallelization**: Configured in `testng.xml` for parallel execution

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
