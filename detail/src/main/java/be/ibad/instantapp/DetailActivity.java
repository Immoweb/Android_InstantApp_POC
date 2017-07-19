package be.ibad.instantapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import be.ibad.instantapp.data.Post;
import be.ibad.instantapp.feature.detail.R;
import be.ibad.instantapp.service.PostService;

public class DetailActivity extends AppCompatActivity {

    private TextView mTitleTextView;
    private TextView mBodyTextView;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String articleId = "5";
        if (getIntent() != null && getIntent().getData() != null) {
            articleId = getIntent().getData().getLastPathSegment();
            Log.i("DetailActivity", articleId);
        }

        mTitleTextView = findViewById(R.id.title);
        mBodyTextView = findViewById(R.id.body);
        mImageView = findViewById(R.id.image);

        PostService.getInstance().getPostAsync(articleId, new PostService.PostCallback() {
            @Override
            public void success(Post post) {
                setUpView(post);
                findViewById(android.R.id.empty).setVisibility(View.GONE);
            }

            @Override
            public void error() {
                finishAfterTransition();
            }
        });
    }

    public void setUpView(Post post) {
        mTitleTextView.setText(post.getTitlePlain());
        mBodyTextView.setText(Html.fromHtml(post.getContent()));
        Log.i("DetailActivity", post.getAttachments().get(0).getUrl());
        Picasso.with(DetailActivity.this)
                .load(post.getAttachments().get(0).getUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .into(mImageView);
    }
}
