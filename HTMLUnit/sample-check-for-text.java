[...]
public class JavadocPageTest {

	@Test
	public void testClassNav() throws IOException {
		// Gives us an IE7 web client by default
		WebCLient webClient = new WebClient();
		HtmlPage mainPage = (HtmlPage)webClient.getPage("http://htmlunit.sourceforge.net/apidocs/index.html");
		HtmlPage packagePage = (HtmlPage)mainPage.getFrameByName("packageFrame").getEnclosedPage();
		HtmlPage bVerPage = packagePage.getAnchorByHref("com/gargoylesoftware/htmlunit/BrowserVersion.html").click();
		HtmlParagraph p = (HtmlParagraph)bVerPage.getElementsByTagName("p").item(0);
		Assert.assertTrue("Unexpected text", p.asText().startsWith("Objects of this class represent one specific version of a given"));
		webClient.closeAllWindows();
	}

}
