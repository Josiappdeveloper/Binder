package com.dinosoftlabs.binder.AppUtils;

import android.content.Context;
import android.content.DialogInterface;

import com.dinosoftlabs.binder.R;

import androidx.appcompat.app.AlertDialog;

public class AlertMessage {

    public static void AlertDialogNoNetwork(final Context context) {
        if (context != null) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(context);
            builder1.setTitle("No Internet");
            builder1.setMessage("No internet connection. Please check your connection and try again");
            builder1.setCancelable(false);

            builder1.setPositiveButton(
                    "Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();

                        }
                    });


            AlertDialog alert11 = builder1.create();
            alert11.show();
            alert11.getButton(alert11.BUTTON_POSITIVE).setTextColor(context.getResources().getColor(android.R.color.black));
           // alert11.getButton(alert11.BUTTON_POSITIVE);
        }

    }

    public static void AlertVideoNotAvailable(final Context context) {
        if (context != null) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(context);
            builder2.setTitle("Video Unavailavle");
            builder2.setMessage("Video is not available. \nWe are sorry of inconvenience. \nPlease check some other recipes.");
            builder2.setCancelable(false);
           // builder1.setIcon(R.drawable.nonetwork);

            builder2.setPositiveButton(
                    "Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();

                        }
                    });


            AlertDialog alert12 = builder2.create();
            alert12.show();
            alert12.getButton(alert12.BUTTON_POSITIVE).setTextColor(context.getResources().getColor(android.R.color.black));
        }

    }

    public static void AlertNoResultFound(final Context context) {
        if (context != null) {
            AlertDialog.Builder builder13 = new AlertDialog.Builder(context);
            builder13.setTitle("No Result Found");
            builder13.setMessage("No recipe is available related to Search. \nPlease check some other recipes.");
            builder13.setCancelable(false);
            // builder1.setIcon(R.drawable.nonetwork);

            builder13.setPositiveButton(
                    "Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();

                        }
                    });


            AlertDialog alert13 = builder13.create();
            alert13.show();
            alert13.getButton(alert13.BUTTON_POSITIVE).setTextColor(context.getResources().getColor(android.R.color.black));
        }

    }

    public static void Alertmessage(final Context context, String msg) {
        if (context != null) {
            AlertDialog.Builder builder14 = new AlertDialog.Builder(context);
            builder14.setTitle("true dates");
            builder14.setMessage(msg);
            builder14.setCancelable(false);
            // builder1.setIcon(R.drawable.nonetwork);

            builder14.setPositiveButton(
                    "Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();

                        }
                    });


            AlertDialog alert14 = builder14.create();
            alert14.show();
            alert14.getButton(alert14.BUTTON_POSITIVE).setTextColor(context.getResources().getColor(android.R.color.black));
        }

    }
}