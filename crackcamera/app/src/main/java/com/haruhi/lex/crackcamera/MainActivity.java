package com.haruhi.lex.crackcamera;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;

import static com.haruhi.lex.crackcamera.Notification.sendNotification;

public class MainActivity extends AppCompatActivity {

    public static final String CHANNEL_ID = "CAMCRACK";
    public static final int notificationId = 991991;
    Calendar suspendDate = Calendar.getInstance();
    Calendar startDate = Calendar.getInstance();
    Calendar currDate = Calendar.getInstance();

    TextView tvDay;
    TextView tvHour;
    TextView tvMin;
    TextView tvSec;

    static int[] startSets = {2020, 0, 26, 17, 56};
    static int[] endSets = {2020, 9, 12, 14, 50, 1};
    static int cDay;
    static int cHour;
    static int cMin;
    static int cSec;

    //Settings
    public static SharedPreferences sharedPref;
    public static SharedPreferences.Editor sharedEditor;
    public static final String PREF_NAME = "MNDFAKE_PREF";
    public static boolean suspended = false;
    public static int mutex_user = 0;
    public static boolean init_screen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("완전시작");
        sharedPref = getApplicationContext().getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        sharedEditor = sharedPref.edit();
        tvDay = findViewById(R.id.tvDay);
        tvHour = findViewById(R.id.tvHour);
        tvMin = findViewById(R.id.tvMin);
        tvSec = findViewById(R.id.tvSec);
        cDay = 0;
        cHour = 0;
        cMin = 0;
        cSec = 0;

        loadSetting();
        System.out.println("로드전: " + suspendDate.get(Calendar.HOUR) + ":" + suspendDate.get(Calendar.MINUTE) + ":" + suspendDate.get(Calendar.SECOND));
        startDate.set(startSets[0], startSets[1], startSets[2], startSets[3], startSets[4]);
        suspendDate.set(endSets[0], endSets[1], endSets[2], endSets[3], endSets[4], endSets[5]);
        System.out.println("로드후: " + suspendDate.get(Calendar.HOUR) + ":" + suspendDate.get(Calendar.MINUTE) + ":" + suspendDate.get(Calendar.SECOND));
        //     System.out.println("날짜차이:" + cDay + "일 " + cHour + "시 " + cMin + "분");
        updatePanel();

        suspended = !suspended;
        init_screen=false;
        onSwitchCamera(findViewById(R.id.btnCameraAllowFull));
        init_screen = true;
      // if(mutex_user==0)
        a1.start();
        mutex_user++;
        sendNotification(getApplicationContext());
        System.out.println("설정 끝 " + mutex_user);
    }

    public Thread a1 = new Thread() {
        public void run() {
            while (true) {
                updateTime();
             //   System.out.println("실행 ");
                try {
                    sleep(999);
                } catch (InterruptedException e) {
                    mutex_user--;
                    e.printStackTrace();
                    break;
                }
            }
        }
    };

    public void onClickDelButton(View v) {
        sendNotification(getApplicationContext());
    }


    public void updateTime() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                int[] sara = getDiff();
                //     System.out.println(sara[0]+ ": "+sara[1]+ ": "+sara[2]+ ": "+sara[3]);
                if (sara[0] != cDay) {
                    cDay = sara[0];
                    String pl = "" + cDay;
                    tvDay.setText(pl);
                }
                if (sara[1] != cHour) {
                    cHour = sara[1];
                    tvHour.setText(two(cHour));

                }
                if (sara[2] != cMin) {
                    cMin = sara[2];
                    tvMin.setText(two(cMin));
                }
                if (sara[3] != cSec) {
                    cSec = sara[3];
                    tvSec.setText(two(cSec));
                }

            }


        });
    }

    public int[] getDiff() {
        //일 시 분 초
        long start = suspendDate.getTimeInMillis();
        currDate = Calendar.getInstance();
        //   System.out.println("기준시: "+suspendDate.get(Calendar.HOUR)+":"+suspendDate.get(Calendar.MINUTE)+":"+suspendDate.get(Calendar.SECOND));
        //  System.out.println("기준시: "+endSets[3]+":"+endSets[4]+":"+endSets[5]);
        long currTime = currDate.getTimeInMillis();
        long lapsed = currTime - start;
        //      System.out.println("계산중 "+currTime+" - "+suspendDate.getTimeInMillis()+" = "+lapsed);
        // 3601
        int pool = (int) (lapsed / 1000);
        int seconds = pool % 60; //1 초
        pool /= 60; //60 분
        //  System.out.println(seconds+"초");
        int minutes = pool % 60; //0분
        pool /= 60; //1시간
        int hour = pool % 24; //1시간
        pool /= 24; //0일
        int days = pool; //0일


        //   System.out.println(days+" , "+ hour+" : "+minutes+" : "+seconds);
        return new int[]{days, hour, minutes, seconds};
    }

    public void updatePanel() {
        loadSetting();
        TextView inst = findViewById(R.id.tvInstallDate);
        TextView susp = findViewById(R.id.tvCheckInTim);
        int iy = startSets[0];
        if (iy > 2000) iy -= 2000;
        int sy = endSets[0];
        if (sy > 2000) sy -= 2000;

        String start = two(iy) + "." + two(startSets[1] + 1) + "." + two(startSets[2]) + " " + two(startSets[3]) + ":" + two(startSets[4]);
        String end = two(sy) + "." + two(endSets[1] + 1) + "." + two(endSets[2]) + " " + two(endSets[3]) + ":" + two(endSets[4]);
        System.out.println("설치 " + start);
        System.out.println("차단 " + end);


        inst.setText(start);
        susp.setText(end);
    }

    public String two(int a) {
        if (a == 0) {
            return "00";
        } else if (a < 10) {
            return "0" + a;
        } else {
            return "" + a;
        }
    }

    public static void saveSetting() {
        sharedEditor.putBoolean("status", suspended);


        sharedEditor.putInt("startY", startSets[0]);
        sharedEditor.putInt("startM", startSets[1]);
        sharedEditor.putInt("startD", startSets[2]);
        sharedEditor.putInt("startH", startSets[3]);
        sharedEditor.putInt("startMin", startSets[4]);

        sharedEditor.putInt("stopY", endSets[0]);
        sharedEditor.putInt("stopM", endSets[1]);
        sharedEditor.putInt("stopD", endSets[2]);
        sharedEditor.putInt("stopH", endSets[3]);
        sharedEditor.putInt("stopMin", endSets[4]);
        sharedEditor.putInt("stopSec", endSets[5]);

        sharedEditor.commit();
       // sharedEditor.apply();
    }

    public static void loadSetting() {
        suspended = sharedPref.getBoolean("status", false);
        startSets[0] = sharedPref.getInt("startY", 2020);
        startSets[1] = sharedPref.getInt("startM", 0);
        startSets[2] = sharedPref.getInt("startD", 26);
        startSets[3] = sharedPref.getInt("startH", 17);
        startSets[4] = sharedPref.getInt("startMin", 20);


        endSets[0] = sharedPref.getInt("stopY", 2020);
        endSets[1] = sharedPref.getInt("stopM", 9);
        endSets[2] = sharedPref.getInt("stopD", 12);
        endSets[3] = sharedPref.getInt("stopH", 12);
        endSets[4] = sharedPref.getInt("stopMin", 0);
        endSets[5] = sharedPref.getInt("stopSec", 0);

    }

    public void onClickMND(View view) {
        view.setVisibility(View.GONE);
        EditText et = findViewById(R.id.editMND);
        et.setVisibility(View.VISIBLE);
        Button bt = findViewById(R.id.editButton);
        bt.setVisibility(View.VISIBLE);
    }

    public void onClickEditDone(View view) {
        view.setVisibility(View.GONE);
        EditText et = findViewById(R.id.editMND);
        et.setVisibility(View.GONE);
        ImageView iv = findViewById(R.id.mndLogo);
        iv.setVisibility(View.VISIBLE);
        try {
            String letter = et.getText().toString();
            System.out.println("텍스트: " + letter);
            String[] tok = letter.split("/");
            System.out.println("텍스트: " + tok.length);
            if (tok.length == 5) {
                System.out.println("올바른 형식");
                int yy = Integer.parseInt(tok[0]);
                if (yy < 2000) yy += 2000;
                startSets[0] = yy;
                startSets[1] = Integer.parseInt(tok[1]);
                startSets[2] = Integer.parseInt(tok[2]);
                startSets[3] = Integer.parseInt(tok[3]);
                startSets[4] = Integer.parseInt(tok[4]);
                saveSetting();
                updatePanel();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void onSwitchCamera(View view) {
        Button toggleButton = (Button) view;
        RelativeLayout rl1 = findViewById(R.id.rlTitle);
        RelativeLayout rl2 = findViewById(R.id.rlSubTitle);
        LinearLayout ll1 = findViewById(R.id.llSuspendTime);
        LinearLayout ll2 = findViewById(R.id.llDelayTime);

        ImageView cam_censor = findViewById(R.id.ivCameraStickerCensor);
        ImageView cam_allow = findViewById(R.id.ivCameraSticker);
        ProgressBar prg = findViewById(R.id.pdProgress);

        Button btl = findViewById(R.id.bt_menu);
        Button btr = findViewById(R.id.bt_del);
        float factor = getApplicationContext().getResources().getDisplayMetrics().density;

        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams((int) (33 * factor), (int) (33 * factor));
        LinearLayout.LayoutParams letParams = new LinearLayout.LayoutParams((int) (48 * factor), (int) (35 * factor));
        iconParams.gravity = Gravity.CENTER;
        letParams.gravity = Gravity.CENTER;

        if (suspended) {
            System.out.println("허용상태");
            //카메라 허용 -> 차단
            //  System.out.println("화면구성중 "+suspendDate.getTimeInMillis());

            endSets[0] = suspendDate.get(Calendar.YEAR);
            endSets[1] = suspendDate.get(Calendar.MONDAY);
            endSets[2] = suspendDate.get(Calendar.DATE);
            endSets[3] = suspendDate.get(Calendar.HOUR_OF_DAY);
            endSets[4] = suspendDate.get(Calendar.MINUTE);
            endSets[5] = suspendDate.get(Calendar.SECOND);
            toggleButton.setText(R.string.mndmdm_common_camera_allow);
            toggleButton.setBackgroundResource(R.drawable.style_mndmdm_btn_allow);

            btr.setLayoutParams(iconParams);
            btl.setLayoutParams(iconParams);
            btr.setBackgroundResource(R.drawable.img_common_btn_alert);
            btl.setBackgroundResource(R.drawable.menu);

            rl1.setBackgroundResource(R.drawable.img_bg_user_soldier);
            rl2.setBackgroundResource(R.drawable.img_bg_user_soldier_sub);
            ll1.setVisibility(View.VISIBLE);
            cam_censor.setVisibility(View.VISIBLE);
            cam_allow.setVisibility(View.INVISIBLE);
            ll2.setVisibility(View.VISIBLE);
            prg.setVisibility(View.VISIBLE);
        } else {
            System.out.println("허용상태");
            //카메라 차단 -> 허용
            toggleButton.setText(R.string.mndmdm_common_camera_deny);
            toggleButton.setBackgroundResource(R.drawable.style_mndmdm_btn_deny);
            btr.setLayoutParams(letParams);
            btl.setLayoutParams(letParams);
            btr.setBackgroundResource(R.drawable.img_common_drawer_delete);
            btl.setBackgroundResource(R.drawable.img_common_drawer_menu);

            rl1.setBackgroundResource(R.drawable.img_bg_user_out);
            rl2.setBackgroundResource(R.drawable.img_bg_user_out_sub);
            ll1.setVisibility(View.INVISIBLE);
            cam_censor.setVisibility(View.INVISIBLE);
            cam_allow.setVisibility(View.VISIBLE);
            ll2.setVisibility(View.INVISIBLE);
            prg.setVisibility(View.INVISIBLE);
        }
        if (init_screen) {
            suspendDate = Calendar.getInstance();
            suspended = !suspended;
            saveSetting();
        }
        updatePanel();
    }
}