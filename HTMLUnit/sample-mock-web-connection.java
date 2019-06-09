[...]
public class InlineHtmlFixtureTest {

  @Test
  public void testInlineHtmlFixture() {
    final String expectedTitle = "Hello 1!";
    String html = "<html><head><title>" + expectedTitle + "</title></head></html>";
    WebClient webClient = new WebClient();
    MockWebConnection conn = new MockWebConnection();
    conn.setDefaultResponse(html);
    webClient.setWebConnection(conn);
    HtmlPage page = webClient.getPage("http://page");
    Assert.assertEquals(expectedTitle, page.getTitleText());
    webClient.closeAllWindows();
  }

  @Test
  public void testInlineHtmlFixtures() throws Exception {
    WebClient webClient = new WebClient();

    // Don't forget the trailing '/' - it's a common pitfall
    final URL page1Url = new URL("http://Page1/");
    final URL page2Url = new URL("http://Page2/");
    final URL page3Url = new URL("http://Page3/");

    MockWebConnection conn = new MockWebConnection();
    conn.setResponse(page1Url, "<html><head><title>Hello 1!</title></head></html>");
    conn.setResponse(page1Url, "<html><head><title>Hello 2!</title></head></html>");
    conn.setResponse(page1Url, "<html><head><title>Hello 3!</title></head></html>");
    webClient.setWebConnection(conn);

    HtmlPage page1 = webClient.getPage(page1Url);
    Assert.assertEquals("Hello 1!", page1.getTitleText());

    HtmlPage page2 = webClient.getPage(page2Url);
    Assert.assertEquals("Hello 2!", page2.getTitleText());

    HtmlPage page3 = webClient.getPage(page3Url);
    Assert.assertEquals("Hello 3!", page3.getTitleText());

    webClient.closeAllWindows();
  }

}
