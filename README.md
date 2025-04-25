# Document (Prototype Design Pattern)

## Overview
This project implements the Prototype Design Pattern for document management as illustrated in the UML diagram below:

![Document Prototype UML Diagram]![alt text](image.png)

## Key Components

### Document Interface
- Defines the base prototype interface with methods for cloning, opening, and getting document type
- Extends the Cloneable interface to enable object cloning

### Concrete Document Classes
- **PdfDocument**: Represents PDF documents with fileName, author, pageCount, and name
- **TextDocument**: Represents text documents with filePath, encoding, and wordCount
- **SpreadsheetDocument**: Represents spreadsheet documents with spreadsheetName, rowCount, and columnCount

### DocumentRegistry
- Serves as a prototype manager that maintains a registry of document prototypes
- Provides factory methods to create new document instances by cloning the prototypes
- Includes some auxiliary animal creation methods as specified in the diagram

### ProcessedDocument
- Contains the main method that demonstrates the prototype pattern in action
- Creates various document instances and shows how they can be cloned and manipulated

## Design Pattern Benefits
- **Reduced Object Creation Cost**: Objects are created by copying existing ones
- **Flexibility**: New objects can be created without knowing their specific types
- **Consistency**: All objects created from the same prototype share initial properties
- **Customization**: Cloned objects can be customized after creation

## Output Example
When running the program, you'll see output similar to:
```
Creating a PDF Document prototype.
Creating a Text Document prototype.
Creating a Spreadsheet Document prototype.
Opening PDF Document: annual_report_2024.pdf by Acme Corp (150 pages)
Type: PDF, File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150
Opening Text Document: meeting_notes.txt with encoding: UTF-8 (250 words)
Type: Text, Path: meeting_notes.txt, Encoding: UTF-8, Words: 250
Opening Spreadsheet Document: sales_data_q1.xlsx (1000 rows, 20 columns)
Type: Spreadsheet, Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20
Opening PDF Document: summary_report.pdf by Acme Corp (30 pages)
```