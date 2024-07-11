package Esercizio_5_Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({OrderTest.class, OrderServiceTest.class})

public class TestSuite {}
