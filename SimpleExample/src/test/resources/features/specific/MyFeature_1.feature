@AllFeatures
@SpecificFeature1
Feature: Specific Feature 1

  Scenario:
    Given User logs in to portal and navigates "Report 1"
    Then read state break down summary table
    And assert all numbers for their correctness
