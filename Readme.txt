HACKATHON PROJECT
-----------------

TRAVEL INSURANCE PLAN FOR STUDENTS-POLICY BAZAAR WEBSITE
-----------------------------------------------------------


Problem Statement : Find travel insurance plan for students
-----------------

1. display three lowest international  travel insurance plan with amount and insurance provider company
2. Group of  2 student people (Age 22,21)
3. For any European country

Detailed Description: Hackathon Ideas
--------------------

1. Find travel insurance plan for students, for 2 people (Age 22 & 21) & any European country, fill further dummy details & display three lowest international  travel insurance plan with amount and insurance provider company
2. Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email and phone number & capture the error message
3.  Retrieve all Health Insurance menu items and store in a List, Display the same

Key Automation Scope:
--------------------

Filling simple form, Capture warning message
Extract menu items & store in collections
Data Driven approach
Page object model
Cucumber
Git and GitHub
Jenkins



Challenges Faced:
-----------------
ElementClickInterceptedException
StaleElementReferenceException
TimeoutException
NoSuchElementException
Change in URL of the page


OUTPUT (Chrome) :
---------------

@regression
Scenario Outline: Validation of user interaction with policy bazzar site when user searches for Travel insurance plans # src/test/resources/Features/EToEPolicyBazzar.feature:18
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                     # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 302364 bytes]

The user clicked on the Travel Insurance Icon
  When the user click on the travel insurance icon                                                                     # stepDefinitions.TravelInsurance.the_user_click_on_the_travel_insurance_icon()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 214997 bytes]

The user selected the destination as United Kingdom and clicked on the next button
  And the user selects the destination "United Kingdom"                                                                # stepDefinitions.TravelInsurance.the_user_selects_the_destination(java.lang.String)

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 143858 bytes]

Checkout Date07
The user selected the start and end dates, and clicked on the next button 
  And the user selects the trip duration                                                                               # stepDefinitions.TravelInsurance.the_user_selects_the_trip_duration()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 128610 bytes]

The user selected the No of passengers and age of passengers
  And the user selects the no of travellers and age of travellers                                                      # stepDefinitions.TravelInsurance.the_user_selects_the_no_of_travellers_and_age_of_travellers()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 161068 bytes]

The user selected pre-medical condition as No
  And the user selects pre-existing medical condition                                                                  # stepDefinitions.TravelInsurance.the_user_selects_pre_existing_medical_condition()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 263041 bytes]

The user entered the mobile number and clicked on next button
  And the user enter the mobile number "9963423134"                                                                    # stepDefinitions.TravelInsurance.the_user_enter_the_mobile_number(java.lang.String)

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 234222 bytes]

The user selected the student plans and entered the student travel information
  And the user selects the student plans and enters the student travel information                                     # stepDefinitions.TravelInsurance.the_user_selects_the_student_plans_and_enters_the_student_travel_information()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 158097 bytes]

The user clicked on the sort by low to high
  And the user sort the plans from low to high                                                                         # stepDefinitions.TravelInsurance.the_user_sort_the_plans_from_low_to_high()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 219572 bytes]

Reliance and Price ₹1,514
Bajaj Allianz and Price ₹1,628
Niva Bupa (formerly known as Max Bupa) and Price ₹2,089
First three Company Names and total premium amount is displayed in console and captured into Excel
  Then display three lowest international travel insurance plan with amount and insurance provider company             # stepDefinitions.TravelInsurance.display_three_lowest_international_travel_insurance_plan_with_amount_and_insurance_provider_company()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 217414 bytes]


@smoke
Scenario: Insurance products in Health insurance            # src/test/resources/Features/EToEPolicyBazzar.feature:21
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website          # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Insurance products in Health insurance [image/png 302441 bytes]

The user hovered on the Insurance Products
  When the user hover on insurance products                 # stepDefinitions.HealthInsurance.the_user_hover_on_insurance_products()

    Embedding Insurance products in Health insurance [image/png 159902 bytes]

Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs
Health Insurance Claim
Displayed the Health Insurance Products menu items in console and captured into an Excel
  Then the user prints health insurance products menu items # stepDefinitions.HealthInsurance.the_user_prints_health_insurance_products_menu_items()

    Embedding Insurance products in Health insurance [image/png 159915 bytes]


@regression
Scenario: Validation of user interaction with policybazzar site when user searches for car insurance plans # src/test/resources/Features/EToEPolicyBazzar.feature:27
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                         # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 285815 bytes]

Clicked on the Car Insurance Icon
The user clicked on the Car Insurance icon
  When the user click on the car insurance icon                                                            # stepDefinitions.CarInsurance.the_user_click_on_the_car_insurance_icon()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 198426 bytes]

The user clicked on buying a new car
  And the user click on buying a new car                                                                   # stepDefinitions.CarInsurance.the_user_click_on_buying_a_new_car()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 174677 bytes]

The user selected city and RTO
  And the user selects city and RTO                                                                        # stepDefinitions.CarInsurance.the_user_selects_city_and_rto()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 203028 bytes]

The user selected the car brand
  And the user selects car brand                                                                           # stepDefinitions.CarInsurance.the_user_selects_car_brand()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 253100 bytes]

The user selected the car model
  And the user selects car model                                                                           # stepDefinitions.CarInsurance.the_user_selects_car_model()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 197208 bytes]

The user selected the car fuel type
  And the user selects car fuel type                                                                       # stepDefinitions.CarInsurance.the_user_selects_car_fuel_type()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 170502 bytes]

The user selected the car variant
  And the user selects car variant                                                                         # stepDefinitions.CarInsurance.the_user_selects_car_variant()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 193662 bytes]

The user entered the details
  And the user enters FullName and Invalid Email and Mobile Number                                         # stepDefinitions.CarInsurance.the_user_enters_full_name_and_invalid_email_and_mobile_number()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 193934 bytes]

Please enter a valid e-mail ID.
Please enter a valid 10-digit mobile number.
Displayed the Error messages in console and captured into an Excel
  Then capture and display error messages                                                                  # stepDefinitions.CarInsurance.capture_and_display_error_messages()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 193976 bytes]


@smoke
Scenario: Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website # src/test/resources/Features/SmokePolicyBazzar.feature:4
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                                           # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website [image/png 279258 bytes]

  When the user click on the Term life insurance icon                                                                                        # stepDefinitions.SmokeTesting.the_user_click_on_the_term_life_insurance_icon()

    Embedding Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website [image/png 88058 bytes]

  Then the user navigates to Term Life Insurance Page and validate the title of the page                                                     # stepDefinitions.SmokeTesting.the_user_navigates_to_term_life_insurance_page_and_validate_the_title_of_the_page()

    Embedding Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website [image/png 88058 bytes]


@smoke
Scenario: Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website # src/test/resources/Features/SmokePolicyBazzar.feature:10
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                                    # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website [image/png 279329 bytes]

  When the user click on the Health Insurance icon                                                                                    # stepDefinitions.SmokeTesting.the_user_click_on_the_health_insurance_icon()

    Embedding Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website [image/png 280206 bytes]

  Then the user navigates to Health Insurance Page and validate the title of the page                                                 # stepDefinitions.SmokeTesting.the_user_navigates_to_health_insurance_page_and_validate_the_title_of_the_page()

    Embedding Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website [image/png 192764 bytes]


@smoke
Scenario: Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo # src/test/resources/Features/SmokePolicyBazzar.feature:16
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                     # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 286228 bytes]

  When the user click on the Investment Plans icon                                                                     # stepDefinitions.SmokeTesting.the_user_click_on_the_investment_plans_icon()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 285823 bytes]

  When the user click on the policy bazaar icon and navigates back to HomePage                                         # stepDefinitions.SmokeTesting.the_user_click_on_the_policy_bazaar_icon_and_navigates_back_to_home_page()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 285819 bytes]

  Then validate the title of the Page                                                                                  # stepDefinitions.SmokeTesting.validate_the_title_of_the_page()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 285819 bytes]


@smoke
Scenario: Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products # src/test/resources/Features/SmokePolicyBazzar.feature:23
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                  # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products [image/png 280115 bytes]

  When the user click on the view all products                                                                      # stepDefinitions.SmokeTesting.the_user_click_on_the_view_all_products()

    Embedding Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products [image/png 202115 bytes]

  Then validate the displaying of Personal Insurance Tab and Business Insurance Tab                                 # stepDefinitions.SmokeTesting.validate_the_displaying_of_personal_insurance_tab_and_business_insurance_tab()

    Embedding Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products [image/png 213938 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/b9958d73-52dc-4e0d-9e19-c7061367f39a │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘
===============================================
Suite
Total tests run: 7, Passes: 7, Failures: 0, Skips: 0
===============================================



OUTPUT(Edge):
------------

[RemoteTestNG] detected TestNG version 7.8.0
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.

@regression
Scenario Outline: Validation of user interaction with policy bazzar site when user searches for Travel insurance plans # src/test/resources/Features/EToEPolicyBazzar.feature:18
Apr 21, 2024 3:34:52 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 124
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                     # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 286082 bytes]

The user clicked on the Travel Insurance Icon
  When the user click on the travel insurance icon                                                                     # stepDefinitions.TravelInsurance.the_user_click_on_the_travel_insurance_icon()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 286252 bytes]

The user selected the destination as United Kingdom and clicked on the next button
  And the user selects the destination "United Kingdom"                                                                # stepDefinitions.TravelInsurance.the_user_selects_the_destination(java.lang.String)

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 192725 bytes]

Checkout Date21
The user selected the start and end dates, and clicked on the next button 
  And the user selects the trip duration                                                                               # stepDefinitions.TravelInsurance.the_user_selects_the_trip_duration()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 194376 bytes]

The user selected the No of passengers and age of passengers
  And the user selects the no of travellers and age of travellers                                                      # stepDefinitions.TravelInsurance.the_user_selects_the_no_of_travellers_and_age_of_travellers()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 247735 bytes]

The user selected pre-medical condition as No
  And the user selects pre-existing medical condition                                                                  # stepDefinitions.TravelInsurance.the_user_selects_pre_existing_medical_condition()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 250525 bytes]

The user entered the mobile number and clicked on next button
  And the user enter the mobile number "9963423134"                                                                    # stepDefinitions.TravelInsurance.the_user_enter_the_mobile_number(java.lang.String)

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 142058 bytes]

The user selected the student plans and entered the student travel information
  And the user selects the student plans and enters the student travel information                                     # stepDefinitions.TravelInsurance.the_user_selects_the_student_plans_and_enters_the_student_travel_information()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 155577 bytes]

The user clicked on the sort by low to high
  And the user sort the plans from low to high                                                                         # stepDefinitions.TravelInsurance.the_user_sort_the_plans_from_low_to_high()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 216281 bytes]

Reliance and Price ₹1,514
Bajaj Allianz and Price ₹1,628
Niva Bupa (formerly known as Max Bupa) and Price ₹2,089
First three Company Names and total premium amount is displayed in console and captured into Excel
  Then display three lowest international travel insurance plan with amount and insurance provider company             # stepDefinitions.TravelInsurance.display_three_lowest_international_travel_insurance_plan_with_amount_and_insurance_provider_company()

    Embedding Validation of user interaction with policy bazzar site when user searches for Travel insurance plans [image/png 214353 bytes]


@smoke
Scenario: Insurance products in Health insurance            # src/test/resources/Features/EToEPolicyBazzar.feature:21
Apr 21, 2024 3:35:44 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 124
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website          # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Insurance products in Health insurance [image/png 163177 bytes]

The user hovered on the Insurance Products
  When the user hover on insurance products                 # stepDefinitions.HealthInsurance.the_user_hover_on_insurance_products()

    Embedding Insurance products in Health insurance [image/png 159789 bytes]

Family Health Insurance
Senior Citizen Health Insurance
Health Insurance for Parents
Best Health Insurance Plans
Maternity Insurance
Health Insurance Portability
Mediclaim Policy
Critical Illness Insurance
Health Insurance Calculator
Health Insurance Companies
Health Insurance for NRIs
Health Insurance Claim
Displayed the Health Insurance Products menu items in console and captured into an Excel
  Then the user prints health insurance products menu items # stepDefinitions.HealthInsurance.the_user_prints_health_insurance_products_menu_items()

    Embedding Insurance products in Health insurance [image/png 159789 bytes]


@regression
Scenario: Validation of user interaction with policybazzar site when user searches for car insurance plans # src/test/resources/Features/EToEPolicyBazzar.feature:27
Apr 21, 2024 3:35:57 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 124
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                         # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 162224 bytes]

Clicked on the Car Insurance Icon
The user clicked on the Car Insurance icon
  When the user click on the car insurance icon                                                            # stepDefinitions.CarInsurance.the_user_click_on_the_car_insurance_icon()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 197580 bytes]

The user clicked on buying a new car
  And the user click on buying a new car                                                                   # stepDefinitions.CarInsurance.the_user_click_on_buying_a_new_car()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 190991 bytes]

The user selected city and RTO
  And the user selects city and RTO                                                                        # stepDefinitions.CarInsurance.the_user_selects_city_and_rto()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 203733 bytes]

The user selected the car brand
  And the user selects car brand                                                                           # stepDefinitions.CarInsurance.the_user_selects_car_brand()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 185491 bytes]

The user selected the car model
  And the user selects car model                                                                           # stepDefinitions.CarInsurance.the_user_selects_car_model()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 197073 bytes]

The user selected the car fuel type
  And the user selects car fuel type                                                                       # stepDefinitions.CarInsurance.the_user_selects_car_fuel_type()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 168905 bytes]

The user selected the car variant
  And the user selects car variant                                                                         # stepDefinitions.CarInsurance.the_user_selects_car_variant()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 193719 bytes]

The user entered the details
  And the user enters FullName and Invalid Email and Mobile Number                                         # stepDefinitions.CarInsurance.the_user_enters_full_name_and_invalid_email_and_mobile_number()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 192880 bytes]

Please enter a valid e-mail ID.
Please enter a valid 10-digit mobile number.
Displayed the Error messages in console and captured into an Excel
  Then capture and display error messages                                                                  # stepDefinitions.CarInsurance.capture_and_display_error_messages()

    Embedding Validation of user interaction with policybazzar site when user searches for car insurance plans [image/png 192910 bytes]


@smoke
Scenario: Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website # src/test/resources/Features/SmokePolicyBazzar.feature:4
Apr 21, 2024 3:36:27 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 124
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                                           # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website [image/png 162409 bytes]

  When the user click on the Term life insurance icon                                                                                        # stepDefinitions.SmokeTesting.the_user_click_on_the_term_life_insurance_icon()

    Embedding Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website [image/png 87816 bytes]

  Then the user navigates to Term Life Insurance Page and validate the title of the page                                                     # stepDefinitions.SmokeTesting.the_user_navigates_to_term_life_insurance_page_and_validate_the_title_of_the_page()

    Embedding Validation of user navigate to Term Life Insurance page on clicking Term Life Iinsurance icon in Homepage of Policy Bazzar website [image/png 87816 bytes]


@smoke
Scenario: Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website # src/test/resources/Features/SmokePolicyBazzar.feature:10
Apr 21, 2024 3:36:45 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 124
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                                    # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website [image/png 162111 bytes]

  When the user click on the Health Insurance icon                                                                                    # stepDefinitions.SmokeTesting.the_user_click_on_the_health_insurance_icon()

    Embedding Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website [image/png 302962 bytes]

  Then the user navigates to Health Insurance Page and validate the title of the page                                                 # stepDefinitions.SmokeTesting.the_user_navigates_to_health_insurance_page_and_validate_the_title_of_the_page()

    Embedding Validation of user navigate to Health Insurance page on clicking Health Insurance icon in Homepage of Policy Bazzar website [image/png 302962 bytes]


@smoke
Scenario: Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo # src/test/resources/Features/SmokePolicyBazzar.feature:16
Apr 21, 2024 3:36:57 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 124
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                     # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 286252 bytes]

  When the user click on the Investment Plans icon                                                                     # stepDefinitions.SmokeTesting.the_user_click_on_the_investment_plans_icon()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 286252 bytes]

  When the user click on the policy bazaar icon and navigates back to HomePage                                         # stepDefinitions.SmokeTesting.the_user_click_on_the_policy_bazaar_icon_and_navigates_back_to_home_page()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 286252 bytes]

  Then validate the title of the Page                                                                                  # stepDefinitions.SmokeTesting.validate_the_title_of_the_page()

    Embedding Validation of user navigate to Investment Plans and navigate back to HomePage on clicking policy bazaar logo [image/png 286252 bytes]


@smoke
Scenario: Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products # src/test/resources/Features/SmokePolicyBazzar.feature:23
Apr 21, 2024 3:37:11 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 124, returning the closest version; found: 121; Please update to a Selenium version that supports CDP version 124
The user navigated to Policy Bazaar HomePage
  Given the user navigate to policy bazaar website                                                                  # stepDefinitions.TravelInsurance.the_user_navigate_to_policy_bazzar_website()

    Embedding Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products [image/png 162306 bytes]

  When the user click on the view all products                                                                      # stepDefinitions.SmokeTesting.the_user_click_on_the_view_all_products()

    Embedding Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products [image/png 269702 bytes]

  Then validate the displaying of Personal Insurance Tab and Business Insurance Tab                                 # stepDefinitions.SmokeTesting.validate_the_displaying_of_personal_insurance_tab_and_business_insurance_tab()

    Embedding Validation of displaying the Personal Insurance and Business Insurance tabs on clicking view all products [image/png 269702 bytes]

┌──────────────────────────────────────────────────────────────────────────┐
│ View your Cucumber Report at:                                            │
│ https://reports.cucumber.io/reports/64836230-252f-4de7-b22c-346817a045d5 │
│                                                                          │
│ This report will self-destruct in 24h.                                   │
│ Keep reports forever: https://reports.cucumber.io/profile                │
└──────────────────────────────────────────────────────────────────────────┘
===============================================
Suite
Total tests run: 7, Passes: 7, Failures: 0, Skips: 0
===============================================




DEPENDENCIES :
------------


<build>
		<pluginManagement>
			<plugins>
				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-compiler-plugin</artifactId>
					<version>3.11.0</version>
				</plugin>

				<plugin>
					<groupId>org.apache.maven.plugins</groupId>
					<artifactId>maven-surefire-plugin</artifactId>
					<version>3.2.2</version>
					<configuration>
						<suiteXmlFiles>
							<suiteXmlFile>master.xml</suiteXmlFile>
							<!-- <suiteXmlFile>xyz.xml</suiteXmlFile>-->
						</suiteXmlFiles>
					</configuration>
				</plugin>

			</plugins>

		</pluginManagement>
	</build>

	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.17.0</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.6.3</version>
		</dependency>
		
	 	<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
		    <groupId>org.apache.poi</groupId>
		    <artifactId>poi</artifactId>
		    <version>5.2.3</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.3</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.8.0</version>
			<scope>test</scope>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
		<dependency>
			<groupId>com.aventstack</groupId>
			<artifactId>extentreports</artifactId>
			<version>5.1.1</version>
		</dependency>


	 <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
		<dependency>
		    <groupId>org.apache.logging.log4j</groupId>
		    <artifactId>log4j-core</artifactId>
		    <version>2.20.0</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
		<dependency>
		    <groupId>org.apache.logging.log4j</groupId>
		    <artifactId>log4j-api</artifactId>
		    <version>2.20.0</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-chrome-driver</artifactId>
			<version>4.18.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
   		 	<groupId>io.cucumber</groupId>
   			<artifactId>cucumber-java</artifactId>
    		<version>7.15.0</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
		<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>7.15.0</version>
			<scope>test</scope>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
		<dependency>
    		<groupId>io.cucumber</groupId>
    		<artifactId>cucumber-testng</artifactId>
    		<version>7.15.0</version>
    		<scope>test</scope>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		<dependency>
		    <groupId>commons-io</groupId>
		    <artifactId>commons-io</artifactId>
		    <version>2.11.0</version>
		</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
		<dependency>
		    <groupId>org.apache.commons</groupId>
		    <artifactId>commons-lang3</artifactId>
		    <version>3.12.0</version>
		</dependency>

	
	<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports-cucumber4-adapter -->
	<dependency>
	    <groupId>tech.grasshopper</groupId>
	    <artifactId>extentreports-cucumber7-adapter</artifactId>
	    <version>1.14.0</version>
	</dependency>

	</dependencies>