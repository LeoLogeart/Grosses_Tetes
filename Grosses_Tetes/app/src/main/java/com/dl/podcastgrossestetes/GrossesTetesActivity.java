package com.dl.podcastgrossestetes;

import android.os.Bundle;

import com.cynh.podcastdownloader.context.DownloadActivity;
import com.cynh.podcastdownloader.model.Podcast;
import com.google.firebase.analytics.FirebaseAnalytics;

public class GrossesTetesActivity extends DownloadActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] types = {"Intégrale", "Best of", "Invité mystère", "Pépites"};
        setAdId("ca-app-pub-9891261141906247/3743396414");
        Podcast.setPodcastTypes(types);
        setParser(new PodcastParser());
        setRssUrl("http://www.rtl.fr/podcast/les-grosses-tetes.xml");
        setFirebase(FirebaseAnalytics.getInstance(this));
        super.onCreate(savedInstanceState);
    }
}
