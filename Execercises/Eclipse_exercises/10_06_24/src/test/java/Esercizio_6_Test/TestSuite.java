package Esercizio_6_Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({UserTest.class, NotificationServiceTest.class})

public class TestSuite {}
