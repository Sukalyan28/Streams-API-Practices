package com.java.stream.interview_problems;

import com.java.stream.interview_problems.domain.CorporateEmployee;
import com.java.stream.interview_problems.domain.Project;
import java.util.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * You are given a list of employees. Each employee has an id, name, and a list of projects they
 * have worked on. Each project has a name and duration in months.
 *
 * <p>Write a Java program to find the employee who has worked on the most projects.
 *
 * <p>If there are multiple employees with the same maximum number of projects,
 *
 * <p>return the employee with the longest total duration of projects. If there are still ties,
 * return any one of the tied employees.
 */

public class EmployeeWorkedForMaxProjects {
  @Test
  @Disabled("Remove This Once you Complete The Exercise")
  public void numberOfOccurencesOfEachCharacter() {
    final List<Project> projects1 =
        List.of(
            new Project("E1", 2), new Project("E2", 1), new Project("E3", 2), new Project("E4", 2));

    final List<Project> projects2 =
        List.of(
            new Project("E1", 2), new Project("E2", 2), new Project("E3", 2), new Project("E4", 2));

    List<CorporateEmployee> corporateEmployees = new ArrayList<>();
    corporateEmployees.add(new CorporateEmployee(1, "Priyanka", projects1));
    corporateEmployees.add(new CorporateEmployee(2, "Zahid", projects2));

    var actualOutput = ""; // Assert that the actual output matches the expected output
  }


  void solution() {
    final List<Project> projects1 =
        List.of(
            new Project("E1", 2), new Project("E2", 1), new Project("E3", 2), new Project("E4", 2));

    final List<Project> projects2 =
        List.of(
            new Project("E1", 2), new Project("E2", 2), new Project("E3", 2), new Project("E4", 2));

    List<CorporateEmployee> corporateEmployees = new ArrayList<>();
    corporateEmployees.add(new CorporateEmployee(1, "Priyanka", projects1));
    corporateEmployees.add(new CorporateEmployee(2, "Zahid", projects2));

    final Optional<CorporateEmployee> first =
        corporateEmployees.stream()
            .map(x -> (CorporateEmployee) x)
            .max(
                Comparator.comparing(CorporateEmployee::projectSize)
                    .thenComparing(CorporateEmployee::sumOfProjectDurations))
            .stream()
            .findFirst();
  }

}

