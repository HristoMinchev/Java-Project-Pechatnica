import java.io.*;
import java.util.*;

class Manager extends Employee {
    final double bonusThreshold;
    final double bonusPercentage;

    public Manager(String name, double baseSalary, double bonusThreshold, double bonusPercentage) {
        super(name, baseSalary);
        this.bonusThreshold = bonusThreshold;
        this.bonusPercentage = bonusPercentage;
    }

    public double calculateSalary(double income) {
        if (income > bonusThreshold) return baseSalary * (1 + bonusPercentage);
        return baseSalary;
    }
}