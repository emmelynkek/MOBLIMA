package Data;

import Model.*;
import Controller.*;
import java.util.*;
import java.io.*;

/**
 * A Class used to read and write Object data to an external .txt file.
 * @version 1.0
 * @since 2022-11-12
 */
public class SerializeDB {
	/**
	 * Reads MoviegoerAccounts Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return MoviegoerAccounts object that has been read from the target .txt
	 *         file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static MoviegoerAccounts readUserAccounts(String filename) {
		MoviegoerAccounts pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (MoviegoerAccounts) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Reads AdminAccounts Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return AdminAccounts object that has been read from the target .txt file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static AdminAccounts readAdminAccounts(String filename) {
		AdminAccounts pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (AdminAccounts) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Reads CineplexList Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return CineplexList object that has been read from the target .txt file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static CineplexList readCineplexList(String filename) {
		CineplexList pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (CineplexList) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Reads MovieList Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return MovieList object that has been read from the target .txt file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static MovieList readMovieList(String filename) {
		MovieList pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (MovieList) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Reads Top5List Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return object that has been read from the target .txt file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static Top5List readTop5List(String filename) {
		Top5List pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (Top5List) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Reads BookingList Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return BookingList object that has been read from the target .txt file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static BookingList readBookingList(String filename) {
		BookingList pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (BookingList) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Reads PublicHolidayList Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return PublicHolidayList object that has been read from the target .txt file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static PublicHolidayList readPublicHolidayList(String filename) {
		PublicHolidayList pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (PublicHolidayList) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Reads TicketPrice Object from a .txt file.
	 * @param filename The file path of the .txt file to be read.
	 * @return TicketPrice object that has been read from the target .txt file.
	 * @throws IOException if object to be read is not Serializeable.
	 */
	public static TicketPrice readTicketPrice(String filename) {
		TicketPrice pDetails = null;
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
			fis = new FileInputStream(filename);
			in = new ObjectInputStream(fis);
			pDetails = (TicketPrice) in.readObject();
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		// print out the size
		// System.out.println(" Details Size: " + pDetails.size());
		// System.out.println();
		return pDetails;
	}

	/**
	 * Writes MoviegoerAccounts Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The MoviegoerAccounts Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, MoviegoerAccounts db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes AdminAccounts Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The AdminAccounts Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, AdminAccounts db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes CineplexList Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The CineplexList Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, CineplexList db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes MovieList Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The MovieList Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, MovieList db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes Top5List Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The Top5List Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, Top5List db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes BookingList Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The BookingList Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, BookingList db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes PublicHolidayList Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The PublicHolidayList Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, PublicHolidayList db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Writes TicketPrice Object to a .txt file.
	 * @param filename The file path of the .txt file to be written to.
	 * @param db       The TicketPrice Object to be written.
	 * @throws IOException if object to be written is not Serializeable.
	 */
	public static void writeSerializedObject(String filename, TicketPrice db) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(db);
			out.close();
			// System.out.println("Object Persisted");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Main method to be run to create .txt files containing dummy data
	 */
	public static void main(String[] args) throws Exception {

		AdminAccounts adminDb = new AdminAccounts();
		MoviegoerAccounts userDb = new MoviegoerAccounts();
		CineplexList cList = new CineplexList();
		MovieList mList = new MovieList();
		Top5List t5List = new Top5List();
		BookingList bList = new BookingList();
		PublicHolidayList pList = new PublicHolidayList();
		TicketPrice ticketPrice = new TicketPrice();

		Admin admin = new Admin();
		admin.setId("admin");
		adminDb.setAccount(admin, "admin");

		Moviegoer user1 = new Moviegoer("user1", "81234567", "user1@gmail.com");
		userDb.setAccount(user1, "user1");

		Moviegoer user2 = new Moviegoer("user2", "89765432", "user2@gmail.com");
		userDb.setAccount(user2, "user2");

		Cineplex cineplex1 = new Cineplex("Jurong Point");
		Cineplex cineplex2 = new Cineplex("Suntec City");
		cList.addCineplex(cineplex1);
		cList.addCineplex(cineplex2);

		CinemaMovie m1 = new CinemaMovie();
		m1.setMovie(new Movie()); // creating Movie obj
		m1.setStatus(CinemaMovie.Status.COMING_SOON); // initialise attributes
		m1.setType(CinemaMovie.Type.BLOCKBUSTER);
		m1.getMovie().setTitle("Spy x Family");
		m1.getMovie().setDirectorName("Tatsuya Endo");
		m1.getMovie().setCastNames("Tanezaki Atsumi");
		m1.getMovie().setCastNames("Hayami Saori");
		m1.getMovie().setCastNames("Eguchi Takuya");
		m1.getMovie().setSynopsis(
				"The story follows a spy who has to \"build a family\" to execute a mission, not realizing that the girl he adopts as his daughter is a telepath, and the woman he agrees to be in a marriage with is a skilled assassin.");
		m1.setTicketSales(777777d);
		m1.setEndDate("01-Jan-2023");
		Review r1 = new Review("User 1",
				"Spy x Family is an oddball tonal mashup that blends the action-packed and high-stakes world of spies with a heartwarming, family-friendly comedy.",
				10);
		Review r2 = new Review("User 2", "Spy x Family is an anime of the year candidate.", 5);
		m1.setReviews(r1);
		m1.setReviews(r2);
		mList.addMovie(m1);

		CinemaMovie m2 = new CinemaMovie();
		m2.setMovie(new Movie()); // creating Movie obj
		m2.setStatus(CinemaMovie.Status.NOW_SHOWING); // initialise attributes
		m2.setType(CinemaMovie.Type.THREE_D);
		m2.getMovie().setTitle("Black Adam");
		m2.getMovie().setDirectorName("Jaume Collet-Serra");
		m2.getMovie().setCastNames("Dwayne Johnson");
		m2.getMovie().setCastNames("Aldis Hodge");
		m2.getMovie().setCastNames("Noah Centineo");
		m2.getMovie().setSynopsis(
				"Nearly 5,000 years after he was bestowed with the almighty powers of the Egyptian gods -- and imprisoned just as quickly -- Black Adam is freed from his earthly tomb, ready to unleash his unique form of justice on the modern world.");
		m2.setTicketSales(0d);
		m2.setEndDate("02-Jan-2023");
		Review r3 = new Review("User 3", "watchable but not great.", 8);
		Review r4 = new Review("User 4", "good movie, lots of action and always good to see the Rock kicking butt", 9);
		m2.setReviews(r3);
		m2.setReviews(r4);
		mList.addMovie(m2);

		CinemaMovie m3 = new CinemaMovie();
		m3.setMovie(new Movie()); // creating Movie obj
		m3.setStatus(CinemaMovie.Status.PREVIEW); // initialise attributes
		m3.setType(CinemaMovie.Type.BLOCKBUSTER);
		m3.getMovie().setTitle("Marvel Studios' Black Panther: Wakanda Forever");
		m3.getMovie().setDirectorName("Ryan Coogler");
		m3.getMovie().setCastNames("Letitia Wright");
		m3.getMovie().setCastNames("Tenoch Huerta");
		m3.getMovie().setCastNames("Martin Freeman");
		m3.getMovie().setSynopsis(
				"In Marvel Studios' \"Black Panther: Wakanda Forever,\" Queen Ramonda, Shuri, M'Baku, Okoye and the Dora Milaje, fight to protect their nation from intervening world powers in the wake of King T'Challa's death."
						+
						" As the Wakandans strive to embrace their next chapter, the heroes must band together with the help of War Dog Nakia and Everett Ross, and forge a new path for the kingdom of Wakanda.");
		m3.setTicketSales(999999d);
		m3.setEndDate("03-Jan-2023");
		Review r5 = new Review("User 5", "Wakanda forever!", 7);
		Review r6 = new Review("User 6", "Rip Chadwick Boseman", 9);
		m3.setReviews(r5);
		m3.setReviews(r6);
		mList.addMovie(m3);

		CinemaMovie m4 = new CinemaMovie();
		m4.setMovie(new Movie()); // creating Movie obj
		m4.setStatus(CinemaMovie.Status.NOW_SHOWING); // initialise attributes
		m4.setType(CinemaMovie.Type.REGULAR);
		m4.getMovie().setTitle("Ajoomma");
		m4.getMovie().setDirectorName("He Shuming");
		m4.getMovie().setCastNames("Hong Huifang");
		m4.getMovie().setCastNames("Jung Dong-Hwan");
		m4.getMovie().setCastNames("Kang Hyung Suk");
		m4.getMovie().setCastNames("Yeo Jingoo");
		m4.getMovie().setSynopsis(
				"Inspired by the director’s mother, AJOOMMA is the story of a woman’s journey of self-discovery, where Auntie learns to embrace her new independent life with renewed confidence and panache.");
		m4.setTicketSales(45000d);
		m4.setEndDate("03-Jan-2023");
		Review r7 = new Review("User 7", "Yeo Jingoo OPPA! Saranghae <3", 7);
		Review r8 = new Review("User 6", "Nice Singapore Korea collab", 6);
		m4.setReviews(r7);
		m4.setReviews(r8);
		mList.addMovie(m4);

		CinemaMovie m5 = new CinemaMovie();
		m5.setMovie(new Movie()); // creating Movie obj
		m5.setStatus(CinemaMovie.Status.NOW_SHOWING); // initialise attributes
		m5.setType(CinemaMovie.Type.REGULAR);
		m5.getMovie().setTitle("Uunchai");
		m5.getMovie().setDirectorName("Sooraj R. Barjatya");
		m5.getMovie().setCastNames("Anupam Kher");
		m5.getMovie().setCastNames("Amitabh Bachchan");
		m5.getMovie().setCastNames("Boman Irani");
		m5.getMovie().setCastNames("Sarika");
		m5.getMovie().setCastNames("Neena Gupta");
		m5.getMovie().setCastNames("Parineeti Chopra");
		m5.getMovie().setSynopsis(
				"The Amitabh Bachchan-Anupam Kher-Boman Irani trio leave their cozy Delhi lives to trek to Everest Base Camp with friendship as their only motivation. Embark on the journey of a lifetime with Team Uunchai.");
		m5.setTicketSales(31230d);
		m5.setEndDate("03-Dec-2023");
		Review r9 = new Review("User 9", "Heartwarming film!", 6);
		Review r10 = new Review("User 10", "Love the cast", 4);
		m5.setReviews(r9);
		m5.setReviews(r10);
		mList.addMovie(m5);

		CinemaMovie m6 = new CinemaMovie();
		m6.setMovie(new Movie()); // creating Movie obj
		m6.setStatus(CinemaMovie.Status.PREVIEW); // initialise attributes
		m6.setType(CinemaMovie.Type.BLOCKBUSTER);
		m6.getMovie().setTitle("Hell Hole");
		m6.getMovie().setDirectorName("Sam Loh");
		m6.getMovie().setCastNames("Justin Cheung");
		m6.getMovie().setCastNames("Jennifer Yu");
		m6.getMovie().setCastNames("Lam Yiu Sing");
		m6.getMovie().setCastNames("Raymond Chiu");
		m6.getMovie().setSynopsis(
				"This is a tale about love, loss, suffering and karma. A loving mother makes a death pact with a spirit, sacrificing herself to save her son. Years later, the son is bullied in a medical school and dies tragically. Now both mother and son have been reunited as vengeful spirits and are back to exact revenge on those who have wronged them.");
		m6.setTicketSales(74300d);
		m6.setEndDate("03-Jan-2023");
		Review r11 = new Review("User 11", "Thrilling movie!", 3);
		Review r12 = new Review("User 12", "Mediocre plot~~", 4);
		m6.setReviews(r11);
		m6.setReviews(r12);
		mList.addMovie(m6);

		t5List.setSortBy(Top5List.sortBy.RATING);
		t5List.sortList(mList);

		ShowTime st1 = new ShowTime();
		st1.setCinemaCode("R1");
		st1.setCineplexName("Jurong Point");
		st1.setDate("01-Dec-2022");
		st1.setStartTime("1400");
		st1.setEndTime("1600");
		m2.setShowTimes(st1);

		ShowTime st2 = new ShowTime();
		st2.setCinemaCode("R1");
		st2.setCineplexName("Jurong Point");
		st2.setDate("01-Dec-2022");
		st2.setStartTime("1700");
		st2.setEndTime("1900");
		m2.setShowTimes(st2);

		ShowTime st3 = new ShowTime();
		st3.setCinemaCode("R1");
		st3.setCineplexName("Jurong Point");
		st3.setDate("25-Dec-2022");
		st3.setStartTime("1400");
		st3.setEndTime("1600");
		m2.setShowTimes(st3);

		ShowTime st4 = new ShowTime();
		st4.setCinemaCode("R1");
		st4.setCineplexName("Suntec City");
		st4.setDate("01-Dec-2022");
		st4.setStartTime("1400");
		st4.setEndTime("1600");
		m2.setShowTimes(st4);

		ShowTime st5 = new ShowTime();
		st5.setCinemaCode("P3");
		st5.setCineplexName("Jurong Point");
		st5.setDate("01-Dec-2022");
		st5.setStartTime("1400");
		st5.setEndTime("1600");
		m2.setShowTimes(st5);

		Booking booking = new Booking();
		booking.setMovieTitle(m2.getMovie().getTitle());
		booking.setShowTime(st1);
		st1.getSeatLayout().setSeatavailability(5, 5, false);
		booking.setTransactionID("R1");
		booking.setTotalPrice(10.5d);
		booking.setMoviegoer(user1);
		booking.setSeatID("R5C5");
		bList.addBooking(booking);

		PublicHoliday pubHol = new PublicHoliday("Christmas", PublicHoliday.stringToDate("25-Dec-2022"));
		pList.addPublicHoliday(pubHol);

		SerializeDB.writeSerializedObject("Data/AdminAccounts.txt", adminDb);
		SerializeDB.writeSerializedObject("Data/UserAccounts.txt", userDb);
		SerializeDB.writeSerializedObject("Data/CineplexList.txt", cList);
		SerializeDB.writeSerializedObject("Data/MovieList.txt", mList);
		SerializeDB.writeSerializedObject("Data/Top5List.txt", t5List);
		SerializeDB.writeSerializedObject("Data/BookingList.txt", bList);
		SerializeDB.writeSerializedObject("Data/PublicHolidayList.txt", pList);
		SerializeDB.writeSerializedObject("Data/TicketPrice.txt", ticketPrice);

	}
}
