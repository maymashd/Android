package com.rifqimfahmi.foorballapps.models;

import java.lang.System;

@androidx.room.Entity(tableName = "players", primaryKeys = {"idPlayer", "idTeam"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0093\u0001\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00c1\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u00103J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00c6\u0004\u0010\u0095\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0016\u0010\u0096\u0001\u001a\u00030\u0097\u00012\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0014\u0010\u0099\u0001\u001a\u00020\u00032\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003H\u0002J\u0007\u0010\u009b\u0001\u001a\u00020\u0003J\u0007\u0010\u009c\u0001\u001a\u00020\u0003J\u000b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u00d6\u0001J\n\u0010\u009f\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00105R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00105R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00105R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00105R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00105R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00105R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00105R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00105R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00105R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00105R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00105R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00105R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00105R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00105R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00105R\u0013\u0010\'\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00105R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00105R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00105R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00105R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00105R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u00105R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00105R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00105R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00105R\u0013\u00100\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00105R\u0013\u00101\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00105R\u0013\u00102\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00105\u00a8\u0006\u00a0\u0001"}, d2 = {"Lcom/rifqimfahmi/foorballapps/models/Player;", "", "idPlayer", "", "idTeam", "dateBorn", "dateSigned", "idPlayerManager", "idSoccerXML", "intLoved", "intSoccerXMLTeamID", "strBanner", "strBirthLocation", "strCollege", "strCutout", "strDescriptionCN", "strDescriptionDE", "strDescriptionEN", "strDescriptionES", "strDescriptionFR", "strDescriptionHU", "strDescriptionIL", "strDescriptionIT", "strDescriptionJP", "strDescriptionNL", "strDescriptionNO", "strDescriptionPL", "strDescriptionPT", "strDescriptionRU", "strDescriptionSE", "strFacebook", "strFanart1", "strFanart2", "strFanart3", "strFanart4", "strGender", "strHeight", "strInstagram", "strLocked", "strNationality", "strPlayer", "strPosition", "strSigning", "strSport", "strTeam", "strThumb", "strTwitter", "strWage", "strWebsite", "strWeight", "strYoutube", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDateBorn", "()Ljava/lang/String;", "getDateSigned", "getIdPlayer", "getIdPlayerManager", "getIdSoccerXML", "getIdTeam", "getIntLoved", "getIntSoccerXMLTeamID", "getStrBanner", "getStrBirthLocation", "getStrCollege", "getStrCutout", "getStrDescriptionCN", "getStrDescriptionDE", "getStrDescriptionEN", "getStrDescriptionES", "getStrDescriptionFR", "getStrDescriptionHU", "getStrDescriptionIL", "getStrDescriptionIT", "getStrDescriptionJP", "getStrDescriptionNL", "getStrDescriptionNO", "getStrDescriptionPL", "getStrDescriptionPT", "getStrDescriptionRU", "getStrDescriptionSE", "getStrFacebook", "getStrFanart1", "getStrFanart2", "getStrFanart3", "getStrFanart4", "getStrGender", "getStrHeight", "getStrInstagram", "getStrLocked", "getStrNationality", "getStrPlayer", "getStrPosition", "getStrSigning", "getStrSport", "getStrTeam", "getStrThumb", "getStrTwitter", "getStrWage", "getStrWebsite", "getStrWeight", "getStrYoutube", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "formatNumber", "number", "getHeight", "getWeight", "hashCode", "", "toString", "app_debug"})
public final class Player {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idPlayer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dateBorn = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dateSigned = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idPlayerManager = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idSoccerXML = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intLoved = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intSoccerXMLTeamID = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strBanner = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strBirthLocation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strCollege = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strCutout = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionCN = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionDE = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionEN = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionES = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionFR = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionHU = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionIL = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionIT = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionJP = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionNL = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionNO = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionPL = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionPT = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionRU = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strDescriptionSE = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFacebook = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFanart1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFanart2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFanart3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFanart4 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strGender = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strHeight = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strInstagram = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strLocked = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strNationality = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strPlayer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strPosition = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strSigning = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strSport = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strThumb = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTwitter = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strWage = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strWebsite = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strWeight = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strYoutube = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeight() {
        return null;
    }
    
    private final java.lang.String formatNumber(java.lang.String number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateBorn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateSigned() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdPlayerManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdSoccerXML() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntLoved() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntSoccerXMLTeamID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrBirthLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCollege() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCutout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionCN() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionDE() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionEN() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionES() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionFR() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionHU() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionIL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionIT() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionJP() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionNL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionNO() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionPL() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionPT() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionRU() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrDescriptionSE() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFacebook() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFanart1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFanart2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFanart3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFanart4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrInstagram() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrLocked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrNationality() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrSigning() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrSport() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTwitter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrWage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrWebsite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrYoutube() {
        return null;
    }
    
    public Player(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idPlayer")
    java.lang.String idPlayer, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idTeam")
    java.lang.String idTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dateBorn")
    java.lang.String dateBorn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dateSigned")
    java.lang.String dateSigned, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idPlayerManager")
    java.lang.String idPlayerManager, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idSoccerXML")
    java.lang.String idSoccerXML, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intLoved")
    java.lang.String intLoved, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intSoccerXMLTeamID")
    java.lang.String intSoccerXMLTeamID, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strBanner")
    java.lang.String strBanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strBirthLocation")
    java.lang.String strBirthLocation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCollege")
    java.lang.String strCollege, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCutout")
    java.lang.String strCutout, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionCN")
    java.lang.String strDescriptionCN, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionDE")
    java.lang.String strDescriptionDE, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionEN")
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionES")
    java.lang.String strDescriptionES, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionFR")
    java.lang.String strDescriptionFR, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionHU")
    java.lang.String strDescriptionHU, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionIL")
    java.lang.String strDescriptionIL, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionIT")
    java.lang.String strDescriptionIT, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionJP")
    java.lang.String strDescriptionJP, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionNL")
    java.lang.String strDescriptionNL, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionNO")
    java.lang.String strDescriptionNO, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionPL")
    java.lang.String strDescriptionPL, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionPT")
    java.lang.String strDescriptionPT, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionRU")
    java.lang.String strDescriptionRU, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionSE")
    java.lang.String strDescriptionSE, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFacebook")
    java.lang.String strFacebook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart1")
    java.lang.String strFanart1, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart2")
    java.lang.String strFanart2, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart3")
    java.lang.String strFanart3, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart4")
    java.lang.String strFanart4, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strGender")
    java.lang.String strGender, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHeight")
    java.lang.String strHeight, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strInstagram")
    java.lang.String strInstagram, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLocked")
    java.lang.String strLocked, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strNationality")
    java.lang.String strNationality, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strPlayer")
    java.lang.String strPlayer, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strPosition")
    java.lang.String strPosition, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSigning")
    java.lang.String strSigning, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSport")
    java.lang.String strSport, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeam")
    java.lang.String strTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strThumb")
    java.lang.String strThumb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTwitter")
    java.lang.String strTwitter, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWage")
    java.lang.String strWage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWebsite")
    java.lang.String strWebsite, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWeight")
    java.lang.String strWeight, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strYoutube")
    java.lang.String strYoutube) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.rifqimfahmi.foorballapps.models.Player copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idPlayer")
    java.lang.String idPlayer, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idTeam")
    java.lang.String idTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dateBorn")
    java.lang.String dateBorn, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dateSigned")
    java.lang.String dateSigned, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idPlayerManager")
    java.lang.String idPlayerManager, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idSoccerXML")
    java.lang.String idSoccerXML, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intLoved")
    java.lang.String intLoved, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intSoccerXMLTeamID")
    java.lang.String intSoccerXMLTeamID, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strBanner")
    java.lang.String strBanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strBirthLocation")
    java.lang.String strBirthLocation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCollege")
    java.lang.String strCollege, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCutout")
    java.lang.String strCutout, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionCN")
    java.lang.String strDescriptionCN, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionDE")
    java.lang.String strDescriptionDE, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionEN")
    java.lang.String strDescriptionEN, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionES")
    java.lang.String strDescriptionES, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionFR")
    java.lang.String strDescriptionFR, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionHU")
    java.lang.String strDescriptionHU, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionIL")
    java.lang.String strDescriptionIL, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionIT")
    java.lang.String strDescriptionIT, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionJP")
    java.lang.String strDescriptionJP, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionNL")
    java.lang.String strDescriptionNL, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionNO")
    java.lang.String strDescriptionNO, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionPL")
    java.lang.String strDescriptionPL, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionPT")
    java.lang.String strDescriptionPT, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionRU")
    java.lang.String strDescriptionRU, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strDescriptionSE")
    java.lang.String strDescriptionSE, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFacebook")
    java.lang.String strFacebook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart1")
    java.lang.String strFanart1, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart2")
    java.lang.String strFanart2, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart3")
    java.lang.String strFanart3, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFanart4")
    java.lang.String strFanart4, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strGender")
    java.lang.String strGender, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strHeight")
    java.lang.String strHeight, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strInstagram")
    java.lang.String strInstagram, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLocked")
    java.lang.String strLocked, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strNationality")
    java.lang.String strNationality, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strPlayer")
    java.lang.String strPlayer, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strPosition")
    java.lang.String strPosition, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSigning")
    java.lang.String strSigning, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSport")
    java.lang.String strSport, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeam")
    java.lang.String strTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strThumb")
    java.lang.String strThumb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTwitter")
    java.lang.String strTwitter, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWage")
    java.lang.String strWage, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWebsite")
    java.lang.String strWebsite, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWeight")
    java.lang.String strWeight, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strYoutube")
    java.lang.String strYoutube) {
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