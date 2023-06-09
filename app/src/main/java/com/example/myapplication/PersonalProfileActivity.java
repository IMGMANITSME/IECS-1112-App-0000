package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class PersonalProfileActivity extends AppCompatActivity {

    private Boolean isLogin = true;
    private String userName = "GMAN";
    private String userLocation = "臺灣，臺中市";
    private ImageView ivPersonalProfile;
    private TextView tvUserName;
    private TextView tvUserLocation;
    private ScrollView sv2;
    private ImageButton ibProfileDetail;
    private ImageButton ibPhoneDetail;
    private ImageButton ibCouponDetail;
    private ImageButton ibNotificationDetail;
    private ImageButton ibAboutUsDetail;
    private ImageButton ibLogout;
    private ImageButton ibHome;
    private ImageButton ibOder;
    private ImageButton ibCart;
    private ImageButton ibProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_profile);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        ivPersonalProfile = findViewById(R.id.iv_personal_profile);
        tvUserName = findViewById(R.id.tv_user_name);
        tvUserLocation = findViewById(R.id.tv_user_location);
        sv2 = findViewById(R.id.scrollView2);
        ibProfileDetail = findViewById(R.id.ib_profile_detail);
        ibCouponDetail = findViewById(R.id.ib_coupon_detail);
        ibNotificationDetail = findViewById(R.id.ib_notification_detail);
        ibAboutUsDetail = findViewById(R.id.ib_about_us_detail);
        ibLogout = findViewById(R.id.ib_logout);
        ibHome = findViewById(R.id.ib_home);
        ibOder = findViewById(R.id.ib_order);
        ibCart = findViewById(R.id.ib_cart);
        ibProfile = findViewById(R.id.ib_profile);

        sv2.setOverScrollMode(View.OVER_SCROLL_NEVER);

        if (isLogin) {
            tvUserName.setText(userName);
            tvUserLocation.setText(userLocation);
        } else {
            tvUserName.setText("訪客");
            tvUserLocation.setText("臺灣");
        }

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.ib_profile_detail) {
                    if (isLogin){
                        Toast.makeText(PersonalProfileActivity.this, "個人資料", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(PersonalProfileActivity.this, "請先登入", Toast.LENGTH_SHORT).show();
                    }
                }else if (view.getId() == R.id.ib_coupon_detail) {
                    if (isLogin){
                    Toast.makeText(PersonalProfileActivity.this, "優惠券", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(PersonalProfileActivity.this, "請先登入", Toast.LENGTH_SHORT).show();
                    }
                }else if (view.getId() == R.id.ib_notification_detail) {
                    if (isLogin) {
                        Toast.makeText(PersonalProfileActivity.this, "通知", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(PersonalProfileActivity.this, "請先登入", Toast.LENGTH_SHORT).show();
                    }
                }else if (view.getId() == R.id.ib_about_us_detail) {
                    if (isLogin) {
                        Toast.makeText(PersonalProfileActivity.this, "關於我們", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(PersonalProfileActivity.this, "請先登入", Toast.LENGTH_SHORT).show();
                    }
                }else if (view.getId() == R.id.ib_logout) {
                    if (isLogin){
                        Toast.makeText(PersonalProfileActivity.this, "登出", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(PersonalProfileActivity.this, SignInActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(PersonalProfileActivity.this, "尚未登入", Toast.LENGTH_SHORT).show();
                    }
                }else if (view.getId() == R.id.ib_home) {
                    Intent intent = new Intent(PersonalProfileActivity.this, HomeActivity.class);
                    startActivity(intent);
                }else if (view.getId() == R.id.ib_order) {
                    Intent intent = new Intent(PersonalProfileActivity.this, OrderActivity.class);
                    startActivity(intent);
                } else if (view.getId() == R.id.ib_cart) {
                    Intent intent = new Intent(PersonalProfileActivity.this, CartActivity.class);
                    startActivity(intent);
                } else if (view.getId() == R.id.ib_profile) {
                    Intent intent = new Intent(PersonalProfileActivity.this, PersonalProfileActivity.class);
                    startActivity(intent);
                }
            }
        };
        ibProfileDetail.setOnClickListener(listener);
        ibCouponDetail.setOnClickListener(listener);
        ibNotificationDetail.setOnClickListener(listener);
        ibAboutUsDetail.setOnClickListener(listener);
        ibLogout.setOnClickListener(listener);
        ibHome.setOnClickListener(listener);
        ibOder.setOnClickListener(listener);
        ibCart.setOnClickListener(listener);
        ibProfile.setOnClickListener(listener);
    }
}