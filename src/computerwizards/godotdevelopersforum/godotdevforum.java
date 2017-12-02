package computerwizards.godotdevelopersforum;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
//import android.R;
//import computerwizards.godotdevelopersforum.R;


public class godotdevforum extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView mainWebView = (WebView) findViewById(R.id.mainWebView);
        
        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mainWebView.setFocusable(true);
		mainWebView.setFocusableInTouchMode(true);
		mainWebView.getSettings().setJavaScriptEnabled(true);
	//	mainWebView.getSettings().setPluginsEnabled(true);
		//mainWebView.getSettings().setRenderPriority(RenderPriority.HIGH);
		mainWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
		mainWebView.getSettings().setDomStorageEnabled(true);
		mainWebView.getSettings().setDatabaseEnabled(true);
		mainWebView.getSettings().setAppCacheEnabled(true);
		mainWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
			mainWebView.getSettings().setDatabaseEnabled(true);
		//mainWebView.getSettings().setDatabasePath("/data/data/" + mainWebView.getPackageName() + "/databases/");
		webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
		mainWebView.getSettings().setUseWideViewPort(true);
		mainWebView.getSettings().setLoadWithOverviewMode(true);
		mainWebView.getSettings().setBuiltInZoomControls(true);
		mainWebView.getSettings().setSupportZoom(true);
		
		
        mainWebView.setWebViewClient(new MyCustomainWebViewClient());
        mainWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        
        mainWebView.loadUrl("https://godotdevelopers.org/forum/");
    }
    
    private class MyCustomainWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
