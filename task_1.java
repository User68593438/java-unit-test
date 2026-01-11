@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);

	// Напиши код здесь
   assertEquals("Ожидалось, что пользователь с возрастом 19 лет будет признан совершеннолетним (true), но метод вернул false", true, isAdult);
}
