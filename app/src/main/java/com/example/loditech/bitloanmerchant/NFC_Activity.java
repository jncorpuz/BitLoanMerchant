package com.example.loditech.bitloanmerchant;

import android.annotation.TargetApi;
import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.nfc.NfcAdapter.CreateNdefMessageCallback;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static android.nfc.NdefRecord.createMime;
@TargetApi(16)
public class NFC_Activity extends AppCompatActivity implements CreateNdefMessageCallback
{
    EditText amount;
    TextView enterpName;
    NfcAdapter mNfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nfc);

        amount = (EditText) findViewById(R.id.txtAmount);
        enterpName = (TextView) findViewById(R.id.lblEnterpriseName);

        mNfcAdapter = NfcAdapter.getDefaultAdapter(this);
        if(mNfcAdapter == null){
            Toast.makeText(this,"NFC is not available", Toast.LENGTH_LONG).show();
            //finish();
            return;
        }

        mNfcAdapter.setNdefPushMessageCallback(this, this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(NfcAdapter.ACTION_NDEF_DISCOVERED.equals(getIntent().getAction())){
            //processIntent(getIntent());
        }
    }

    @Override
    public NdefMessage createNdefMessage(NfcEvent event) {
        String text = "textTobeSent";
        NdefMessage Ndefmsg = new NdefMessage(
                new NdefRecord[] { createMime(
                   "application/vnd.com.example.android.beam", text.getBytes())
                });
        return Ndefmsg;
    }

    @Override
    public void onNewIntent(Intent intent){
        setIntent(intent);
    }
}
