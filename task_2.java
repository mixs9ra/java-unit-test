@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("  true,    ", true, isAdult);
}

@Test
public void checkIsAdultWhenAgeIsLessThan18False () {
   Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals("  false,     18", false, isAdult); 
}

@Test
public void checkIsAdultWhenAgeIs18True () {
   Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("  true,    18 ", true, isAdult); 
}
