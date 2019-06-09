[...]
@RunWith(value = Parameterized.class)
public class JavadocPageAllBrowserTest {

  private BrowserVersion browserVersion;

  @Parameters
  public static Collection<BrowserVersion[]> getBrowserVersions() {
    // The browser versions below are very outadted, but still useful for demo.
    return Arrays.asList(new BrowserVersion[][]{
      {BrowserVersion.FIREFOX_2},
      {BrowserVersion.FIREFOX_3},
      {BrowserVersion.INTERNET_EXPLORER_6},
      {BrowserVersion.INTERNET_EXPLORER_7}
    });
  }

  public JavadocPageAllBrowserTest(BrowserVersion browserVersion) {
    this.browserVersion = browserVersion;
  }

  @Test
  public void testSearchPage() throws Exception {
    WebClient webClient = new WebClient(this.browserVersion);
    // Same as the non parameterized example
  }

}
