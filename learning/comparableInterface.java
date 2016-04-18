public class comparableInterface
{
	public static void main(String[] args)
	{
		
	}

	class Song implements Comparable<Song>
	{
		String title;
		String artist;
		String rating;
		String bpm;

		// we inherit this method from the comparable interface
		public int compareTo(Song s)
		{
			return title.compareTo(s.getTitle())
		}

		// this is the contructor
		public Song(String t, String a, String r, String b)
		{
			title = a;
			artist = b;
			rating = c;
			bpm = d;
		}

		// Getter methods
		public String getTitle()
		{
			return title;
		}

		public String getArtist()
		{
			return aritst;
		}

		public String getRating()
		{
			return rating;
		}

		public String getBpm()
		{
			return bpm;
		}
	}
}