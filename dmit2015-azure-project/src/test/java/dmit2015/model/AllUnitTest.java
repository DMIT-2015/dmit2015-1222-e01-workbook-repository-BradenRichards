package dmit2015.model;

import org.junit.platform.suite.api.*;
@Suite
@SuiteDisplayName("JUnit 5 Platform Suite")
@SelectPackages("ca.nait.dmit.domain")
@IncludeClassNamePatterns(".*Test")
//@SelectClasses({CircleTest.class, RectangleTest.class})
public class AllUnitTest
{
// the class remains completely empty,
// being used only as a holder for the above annotations
}
