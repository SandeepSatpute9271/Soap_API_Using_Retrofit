# Soap API With Retrofit
> Soap api can be consume with retrofit library

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Screenshots](#screenshots)
* [Setup](#setup)
* [Usage](#usage)
* [Analysis](#analysis)
* [Contact](#contact)
<!-- * [License](#license) -->


## General Information
- Now a days very less anpod app used the SOAP API so it was verdy difficult to me to work with retrofit for SOAP api. There are very few articals which have information soap with reftroft so tried to demonstrate the information here


## Technologies Used
- MVVM architecture
- Java
- Dependency Injection: Android Hilt
- ViewModel
- LiveData
- Lifecycle components


## Features
List of ready features here:
- Soap API
- Retrofit Library 


## Screenshots
<img src="./screenshot1.png" width="200" height="400">        <img src="./screenshot2.png" width="200" height="400">
<!-- If you have screenshots you'd like to share, include them here. -->


## Setup
Nothing such as important to setup the things here, Its just straight forward


## Usage
- It will help in case of consumning the SOAP API using retrofit
- Example of data
    - Input data required is first 2 captal letter of country (example: "IN")
    - Outpout Capital city of provided country (Example: "Delhi")


## Analysis 
When we comapare the Ksoap2 lib with retrofit in terms of performace following is the output it shows in api call

  - Ksoap2: Time Taken In milli sec:1562 for Input IN
  - Ksoap2: Time Taken In milli sec:644 for Input MX
  - Ksoap2: Time Taken In milli sec:1704 for Input UK
  - Ksoap2: Time Taken In milli sec:743 for Input KE
---------------------------------------------------------
  - Retrofit: Time Taken In milli sec:1603 for Input IN
  - Retrofit: Time Taken In milli sec:510 for Input MX
  - Retrofit: Time Taken In milli sec:511 for Input UK
  - Retrofit: Time Taken In milli sec:725 for Input KE

---------------------------------------------------------

Soap Api With Ksoap2 – Repository [GitHub](https://github.com/SandeepSatpute9271/Soap_Api_Using_Ksoap2) 


## Contact
Created by [@Sandeep](https://sandeepksatpute.wixsite.com/resume) - feel free to contact me!


<!-- Optional -->
<!-- ## License -->
<!-- This project is open source and available under the [... License](). -->

<!-- You don't have to include all sections - just the one's relevant to your project -->
