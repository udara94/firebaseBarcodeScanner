package com.example.firebasebarcodescanner.ListingSetup;

import android.view.View;

import com.example.firebasebarcodescanner.ContactsListing.ContactsListingAdapter;

/**
 * Created by Jaison.
 */
public interface CustomItemClickListener {
     void onItemClick(View v, int position);
     void onItemClick(View v, int position, ContactsListingAdapter.ActionItem actionItem);
}
