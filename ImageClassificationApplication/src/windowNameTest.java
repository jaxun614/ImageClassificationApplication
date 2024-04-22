import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class windowNameTest {

	@Test
	void test() {
		GalleryView test = new GalleryView();
		String name = test.getWindowName();
		assertTrue(name == test.getWindowName());
	}

}
