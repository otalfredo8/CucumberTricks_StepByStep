How to create your first cucumber sample project

Given:
1. Using Maven, cucumber-java and cucumber-junit dependencies are in place
2. Folder structure has been created.

a) Create a feature file
b) Create and run runner class
    - snippet
    - features
    - dryRun
    - glue
c) Copy paste undefined steps with snippets in _StepDef class
    - Do not implement the snippets
    - Run runner class again to get PendingException
d) Implement pending steps in _StepDef class
    - If a step contains trowing PendingException, console output will display it.

e) Use these development approaches to implement pending steps:
    - Inside-In Development: Create an instance of Checkout without having such class.
    - Outside-In Development
        > Checkout class to handle "logic" beyond Step
        > Care for class variables

f) Run runner class