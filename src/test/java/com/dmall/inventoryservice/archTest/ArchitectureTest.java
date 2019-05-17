package com.dmall.inventoryservice.archTest;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class ArchitectureTest {

    @Test
    public void my_architecture_apis_not_include_repositories_rule() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("com.dmall.inventoryservice.apis");

        ArchRule rule = noClasses().that().resideInAPackage("..apis..").should().dependOnClassesThat().resideInAPackage("..repositories..");

        rule.check(importedClasses);
    }
}
