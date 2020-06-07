# Coding and Testing assignment

#### Description

The project is an implementation to calculate number of days between two dates provided by the user. It is implemented in JAVA.

GIT is used for source control management. Gradle has been choosen for build and package management.

#### Project execution

1. JAVA (Atleast version 8) and gradle should be inspresent in the system as a pre-requisite for project execution.

2. Download the project from git repository by using below command -

   `git clone https://github.com/dhananjaysinghsengar/Blueoak`

3. Go to assignment directory -

   `cd assignment`

4. Execute gradle build -

   `./gradlew build` - for linux based system

   `gradlew build` - for windows based system

5. User will be prompted to provide start date and end date -

   `Enter start date in dd-Mmm-yyyy format e.g. 05-Feb-2020`

   `Enter end date in dd-Mmm-yyyy format e.g. 05-Mar-2020`

6. An output will be prompted with number of days -
   `Number of Days: <Days>`

   \*Assumption - Logic for calculation is inclusive of both dates.

#### Status code and description

| Status Code | Description                                   |
| :---------: | :-------------------------------------------- |
|     -1      | Start date should not be later than end date. |
|     -2      | Internal error while performing operation.    |
|     -3      | Please reverify inputs for special character  |
|             |                                               |
