package com.dake.foorballapps.vo;

import android.annotation.SuppressLint;
import androidx.room.Entity;
import com.dake.foorballapps.features.matches.MatchesListFragment;
import com.squareup.moshi.Json;
import java.text.SimpleDateFormat;
import java.util.*;

@androidx.room.Entity(tableName = "matches", primaryKeys = {"idEvent"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u00a1\u0001\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00e7\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u00106J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ec\u0004\u0010\u00a2\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0007\u0010\u00a3\u0001\u001a\u00020\u0003J\u0016\u0010\u00a4\u0001\u001a\u00030\u00a5\u00012\t\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0011\u0010\u00a7\u0001\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0003J\t\u0010\u00a8\u0001\u001a\u00020\u0003H\u0007J\t\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00ab\u0001\u00a2\u0006\u0003\u0010\u00ac\u0001J\u000b\u0010\u00ad\u0001\u001a\u00030\u00ae\u0001H\u00d6\u0001J\n\u0010\u00af\u0001\u001a\u00030\u00a5\u0001H\u0007J\n\u0010\u00b0\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00108R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00108R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00108R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00108R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00108R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00108R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00108R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00108R\u001c\u0010D\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010GR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00108R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00108R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00108R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00108R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00108R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00108R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00108R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00108R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00108R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00108R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00108R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00108R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00108R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00108R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00108R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00108R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00108R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u00108R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00108R\u0013\u0010\'\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00108R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00108R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00108R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00108R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00108R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u00108R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u00108R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u00108R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u00108R\u0013\u00100\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u00108R\u0013\u00101\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u00108R\u0013\u00102\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u00108R\u0013\u00103\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u00108R\u0013\u00104\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u00108R\u0013\u00105\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u00108\u00a8\u0006\u00b1\u0001"}, d2 = {"Lcom/dake/foorballapps/vo/Match;", "", "idEvent", "", "dateEvent", "idAwayTeam", "idHomeTeam", "idLeague", "idSoccerXML", "intAwayScore", "intAwayShots", "intHomeScore", "intHomeShots", "intRound", "intSpectators", "strAwayFormation", "strAwayGoalDetails", "strAwayLineupDefense", "strAwayLineupForward", "strAwayLineupGoalkeeper", "strAwayLineupMidfield", "strAwayLineupSubstitutes", "strAwayRedCards", "strAwayTeam", "strAwayYellowCards", "strBanner", "strCircuit", "strCity", "strCountry", "strDate", "strDescriptionEN", "strEvent", "strFanart", "strFilename", "strHomeFormation", "strHomeGoalDetails", "strHomeLineupDefense", "strHomeLineupForward", "strHomeLineupGoalkeeper", "strHomeLineupMidfield", "strHomeLineupSubstitutes", "strHomeRedCards", "strHomeTeam", "strHomeYellowCards", "strLeague", "strLocked", "strMap", "strPoster", "strResult", "strSeason", "strSport", "strTVStation", "strThumb", "strTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateEvent", "()Ljava/lang/String;", "getIdAwayTeam", "getIdEvent", "getIdHomeTeam", "getIdLeague", "getIdSoccerXML", "getIntAwayScore", "getIntAwayShots", "getIntHomeScore", "getIntHomeShots", "getIntRound", "getIntSpectators", "matchType", "getMatchType", "setMatchType", "(Ljava/lang/String;)V", "getStrAwayFormation", "getStrAwayGoalDetails", "getStrAwayLineupDefense", "getStrAwayLineupForward", "getStrAwayLineupGoalkeeper", "getStrAwayLineupMidfield", "getStrAwayLineupSubstitutes", "getStrAwayRedCards", "getStrAwayTeam", "getStrAwayYellowCards", "getStrBanner", "getStrCircuit", "getStrCity", "getStrCountry", "getStrDate", "getStrDescriptionEN", "getStrEvent", "getStrFanart", "getStrFilename", "getStrHomeFormation", "getStrHomeGoalDetails", "getStrHomeLineupDefense", "getStrHomeLineupForward", "getStrHomeLineupGoalkeeper", "getStrHomeLineupMidfield", "getStrHomeLineupSubstitutes", "getStrHomeRedCards", "getStrHomeTeam", "getStrHomeYellowCards", "getStrLeague", "getStrLocked", "getStrMap", "getStrPoster", "getStrResult", "getStrSeason", "getStrSport", "getStrTVStation", "getStrThumb", "getStrTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component6", "component7", "component8", "component9", "copy", "defineMatchType", "equals", "", "other", "format", "getDate", "getHour", "getStartTime", "", "()Ljava/lang/Long;", "hashCode", "", "isNextMatch", "toString", "app_debug"})
public final class Match {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String matchType;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idEvent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dateEvent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idAwayTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idHomeTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idLeague = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idSoccerXML = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intAwayScore = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intAwayShots = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intHomeScore = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intHomeShots = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intRound = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intSpectators = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayFormation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayGoalDetails = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupDefense = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupForward = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupGoalkeeper = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupMidfield = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayLineupSubstitutes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayRedCards = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAwayYellowCards = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strBanner = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strCircuit = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strCity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strCountry = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionEN = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strEvent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFanart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFilename = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeFormation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeGoalDetails = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupDefense = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupForward = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupGoalkeeper = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupMidfield = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeLineupSubstitutes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeRedCards = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHomeYellowCards = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strLeague = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strLocked = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strMap = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strPoster = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strResult = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strSeason = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strSport = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTVStation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strThumb = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTime = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMatchType() {
        return null;
    }
    
    public final void setMatchType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDate() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final boolean isNextMatch() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(@org.jetbrains.annotations.Nullable()
    java.lang.String strHomeGoalDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHour() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String defineMatchType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdHomeTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdLeague() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdSoccerXML() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntAwayScore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntAwayShots() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntHomeScore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntHomeShots() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntRound() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntSpectators() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayFormation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayGoalDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupDefense() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupForward() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupGoalkeeper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupMidfield() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayLineupSubstitutes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayRedCards() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAwayYellowCards() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCircuit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionEN() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFanart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFilename() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeFormation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeGoalDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupDefense() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupForward() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupGoalkeeper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupMidfield() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeLineupSubstitutes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeRedCards() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHomeYellowCards() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrLeague() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrLocked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrMap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrSeason() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrSport() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTVStation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTime() {
        return null;
    }
    
    public Match(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idEvent")
    java.lang.String idEvent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dateEvent")
    java.lang.String dateEvent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idAwayTeam")
    java.lang.String idAwayTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idHomeTeam")
    java.lang.String idHomeTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idLeague")
    java.lang.String idLeague, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idSoccerXML")
    java.lang.String idSoccerXML, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intAwayScore")
    java.lang.String intAwayScore, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intAwayShots")
    java.lang.String intAwayShots, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intHomeScore")
    java.lang.String intHomeScore, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intHomeShots")
    java.lang.String intHomeShots, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intRound")
    java.lang.String intRound, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intSpectators")
    java.lang.String intSpectators, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayFormation")
    java.lang.String strAwayFormation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayGoalDetails")
    java.lang.String strAwayGoalDetails, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupDefense")
    java.lang.String strAwayLineupDefense, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupForward")
    java.lang.String strAwayLineupForward, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupGoalkeeper")
    java.lang.String strAwayLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupMidfield")
    java.lang.String strAwayLineupMidfield, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupSubstitutes")
    java.lang.String strAwayLineupSubstitutes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayRedCards")
    java.lang.String strAwayRedCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayTeam")
    java.lang.String strAwayTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayYellowCards")
    java.lang.String strAwayYellowCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strBanner")
    java.lang.String strBanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCircuit")
    java.lang.String strCircuit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCity")
    java.lang.String strCity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCountry")
    java.lang.String strCountry, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDate")
    java.lang.String strDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionEN")
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strEvent")
    java.lang.String strEvent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart")
    java.lang.String strFanart, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFilename")
    java.lang.String strFilename, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeFormation")
    java.lang.String strHomeFormation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeGoalDetails")
    java.lang.String strHomeGoalDetails, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupDefense")
    java.lang.String strHomeLineupDefense, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupForward")
    java.lang.String strHomeLineupForward, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupGoalkeeper")
    java.lang.String strHomeLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupMidfield")
    java.lang.String strHomeLineupMidfield, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupSubstitutes")
    java.lang.String strHomeLineupSubstitutes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeRedCards")
    java.lang.String strHomeRedCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeTeam")
    java.lang.String strHomeTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeYellowCards")
    java.lang.String strHomeYellowCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLeague")
    java.lang.String strLeague, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLocked")
    java.lang.String strLocked, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strMap")
    java.lang.String strMap, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strPoster")
    java.lang.String strPoster, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strResult")
    java.lang.String strResult, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSeason")
    java.lang.String strSeason, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSport")
    java.lang.String strSport, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTVStation")
    java.lang.String strTVStation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strThumb")
    java.lang.String strThumb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTime")
    java.lang.String strTime) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component51() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dake.foorballapps.vo.Match copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idEvent")
    java.lang.String idEvent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dateEvent")
    java.lang.String dateEvent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idAwayTeam")
    java.lang.String idAwayTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idHomeTeam")
    java.lang.String idHomeTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idLeague")
    java.lang.String idLeague, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idSoccerXML")
    java.lang.String idSoccerXML, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intAwayScore")
    java.lang.String intAwayScore, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intAwayShots")
    java.lang.String intAwayShots, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intHomeScore")
    java.lang.String intHomeScore, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intHomeShots")
    java.lang.String intHomeShots, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intRound")
    java.lang.String intRound, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intSpectators")
    java.lang.String intSpectators, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayFormation")
    java.lang.String strAwayFormation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayGoalDetails")
    java.lang.String strAwayGoalDetails, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupDefense")
    java.lang.String strAwayLineupDefense, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupForward")
    java.lang.String strAwayLineupForward, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupGoalkeeper")
    java.lang.String strAwayLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupMidfield")
    java.lang.String strAwayLineupMidfield, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayLineupSubstitutes")
    java.lang.String strAwayLineupSubstitutes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayRedCards")
    java.lang.String strAwayRedCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayTeam")
    java.lang.String strAwayTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAwayYellowCards")
    java.lang.String strAwayYellowCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strBanner")
    java.lang.String strBanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCircuit")
    java.lang.String strCircuit, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCity")
    java.lang.String strCity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCountry")
    java.lang.String strCountry, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDate")
    java.lang.String strDate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionEN")
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strEvent")
    java.lang.String strEvent, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart")
    java.lang.String strFanart, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFilename")
    java.lang.String strFilename, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeFormation")
    java.lang.String strHomeFormation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeGoalDetails")
    java.lang.String strHomeGoalDetails, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupDefense")
    java.lang.String strHomeLineupDefense, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupForward")
    java.lang.String strHomeLineupForward, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupGoalkeeper")
    java.lang.String strHomeLineupGoalkeeper, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupMidfield")
    java.lang.String strHomeLineupMidfield, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeLineupSubstitutes")
    java.lang.String strHomeLineupSubstitutes, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeRedCards")
    java.lang.String strHomeRedCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeTeam")
    java.lang.String strHomeTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHomeYellowCards")
    java.lang.String strHomeYellowCards, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLeague")
    java.lang.String strLeague, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLocked")
    java.lang.String strLocked, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strMap")
    java.lang.String strMap, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strPoster")
    java.lang.String strPoster, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strResult")
    java.lang.String strResult, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSeason")
    java.lang.String strSeason, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSport")
    java.lang.String strSport, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTVStation")
    java.lang.String strTVStation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strThumb")
    java.lang.String strThumb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTime")
    java.lang.String strTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}