package ee.taltech.inbankbackend.service;

import com.github.vladislavgoltjajev.personalcode.exception.PersonalCodeException;
import com.github.vladislavgoltjajev.personalcode.locale.estonia.EstonianPersonalCodeParser;
import com.github.vladislavgoltjajev.personalcode.locale.estonia.EstonianPersonalCodeValidator;
import ee.taltech.inbankbackend.config.DecisionEngineConstants;

public class DecisionEngineAgeRestrictions {
    EstonianPersonalCodeValidator validator = new EstonianPersonalCodeValidator();

    EstonianPersonalCodeParser parser = new EstonianPersonalCodeParser();

    public boolean isValid(String personalCode){
        return validator.isValid(personalCode);
    }

    public boolean ageRestrictions(String personalCode) throws PersonalCodeException {
        int age = calculateAge(personalCode);
        int expectedLifetime = calculateExpectedLifeTime();
        return age >= DecisionEngineConstants.MINIMUM_AGE && age <= expectedLifetime;
    }

    private int calculateExpectedLifeTime() {
        return 80 - (DecisionEngineConstants.MAXIMUM_LOAN_PERIOD/12);
    }

    private int calculateAge(String personalCode) throws PersonalCodeException {
        return parser.getAge(personalCode).getYears();
    }
}