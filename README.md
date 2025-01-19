# Email Writer Assistant - Chrome Extension

This Chrome extension integrates AI-powered email reply generation directly into Gmail. It allows users to generate professional email replies with a single click, using the backend AI service you've built.

## Features

- **AI Email Reply Generation**: Automatically generates professional email replies based on the email content.
- **Customizable Tone**: Generate replies with a professional tone.
- **Seamless Integration with Gmail**: The extension adds a button to Gmail's compose toolbar to generate replies.
- **Easy-to-Use Interface**: One-click functionality to generate email replies.

## Technologies Used

- **JavaScript**: For creating the content script and interaction with Gmail's UI.
- **Chrome Extension API**: For integrating the extension with the browser.
- **Spring Boot (Backend)**: The backend AI service is built using Spring Boot, which provides RESTful APIs for generating email replies. It handles incoming requests, processes the email content, and integrates with AI models to produce professional responses.

## How It Works

1. **Button Injection**: When the compose window is detected, a button labeled "AI Reply" is injected into Gmail's compose toolbar.
2. **Email Content Extraction**: The content of the email is extracted from the compose window.
3. **AI Reply Generation**: The email content is sent to the backend AI service (running locally at http://localhost:8080) to generate a reply.
4. **Reply Insertion**: The generated reply is inserted into the compose window.
