# Automation Testing Framework

This repository contains an Automation Testing Framework using Maven, TestNG, and Selenium-Java, designed following the Page Object Model (POM) pattern.

## Project Structure
    ```
	├── README.md
	├── pom.xml
	├── src/main/java
	│   │   │   └── com/crm/qa
	│   │   │              ├── base
	│   │   │              ├── config
	│   │   │              ├── pages
	│   │   │              ├── testdata
	│   │   │              └── util
	│   │   │   
	│   │   └── resources
	│   │       ├── chromedriver.exe
	│   │       └── geckodriver.exe
	│   │       └── config.properties
	│   └── test/java
	│          └── com/crm/qa
	│                      └── testCases
	└── pom.xml
	│
	├── target
	│ 
	└── test-output
	│ 
	└── testng.xml
    ```


## Getting Started

### Prerequisites
To set up the project, ensure you have the following installed:
- Java JDK 17 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation
1. Clone the repository to your local machine:

``` sh
   git clone https://github.com/yourusername/automation-testing-framework.git
   ```
   
Navigate to the project directory:

	cd automation-testing-framework

mvn clean install

	mvn test

## Contributing


Contributions are welcome! Please follow these steps:

Fork the repository.

1. Create a new branch: `git checkout -b feature/your-feature-name`

2. Make your changes and commit them: `git commit -m 'Add some feature'`

3. Push to the branch: `git push origin feature/your-feature-name`

4. Open a pull request.


## Connect with me

- **Name:** Arvind Kumar
- **LinkedIn:** [LinkedIn Profile URL](https://www.linkedin.com/in/arvind-kumar-a8b591221/)
- **Email:** [Email](mailto:arvindkumarlbsmca@gmail.com)
  
## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
Special thanks to the contributors of Selenium and TestNG for their powerful tools.

