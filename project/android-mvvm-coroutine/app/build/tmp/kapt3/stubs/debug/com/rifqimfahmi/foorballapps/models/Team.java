package com.rifqimfahmi.foorballapps.models;

import java.lang.System;

@androidx.room.Entity(tableName = "teams", primaryKeys = {"idLeague", "idTeam"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u009c\u0001\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00d9\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u00105J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00de\u0004\u0010\u009e\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0016\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\t\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0007\u0010\u00a2\u0001\u001a\u00020\u0003J\u000b\u0010\u00a3\u0001\u001a\u00030\u00a4\u0001H\u00d6\u0001J\n\u0010\u00a5\u0001\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00107R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00107R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00107R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00107R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00107R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00107R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00107R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00107R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00107R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00107R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00107R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00107R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00107R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00107R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00107R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00107R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00107R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00107R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00107R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00107R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00107R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00107R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00107R\u0013\u0010\'\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u00107R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00107R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00107R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00107R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u00107R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00107R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u00107R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u00107R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u00107R\u0013\u00100\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u00107R\u0013\u00101\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u00107R\u0013\u00102\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u00107R\u0013\u00103\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u00107R\u0013\u00104\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u00107\u00a8\u0006\u00a6\u0001"}, d2 = {"Lcom/rifqimfahmi/foorballapps/models/Team;", "", "idLeague", "", "idTeam", "idSoccerXML", "intFormedYear", "intLoved", "intStadiumCapacity", "strAlternate", "strCountry", "strDescriptionCN", "strDescriptionDE", "strDescriptionEN", "strDescriptionES", "strDescriptionFR", "strDescriptionHU", "strDescriptionIL", "strDescriptionIT", "strDescriptionJP", "strDescriptionNL", "strDescriptionNO", "strDescriptionPL", "strDescriptionPT", "strDescriptionRU", "strDescriptionSE", "strDivision", "strFacebook", "strGender", "strInstagram", "strKeywords", "strLeague", "strLocked", "strManager", "strRSS", "strSport", "strStadium", "strStadiumDescription", "strStadiumLocation", "strStadiumThumb", "strTeam", "strTeamBadge", "strTeamBanner", "strTeamFanart1", "strTeamFanart2", "strTeamFanart3", "strTeamFanart4", "strTeamJersey", "strTeamLogo", "strTeamShort", "strTwitter", "strWebsite", "strYoutube", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdLeague", "()Ljava/lang/String;", "setIdLeague", "(Ljava/lang/String;)V", "getIdSoccerXML", "getIdTeam", "setIdTeam", "getIntFormedYear", "getIntLoved", "getIntStadiumCapacity", "getStrAlternate", "getStrCountry", "getStrDescriptionCN", "getStrDescriptionDE", "getStrDescriptionEN", "getStrDescriptionES", "getStrDescriptionFR", "getStrDescriptionHU", "getStrDescriptionIL", "getStrDescriptionIT", "getStrDescriptionJP", "getStrDescriptionNL", "getStrDescriptionNO", "getStrDescriptionPL", "getStrDescriptionPT", "getStrDescriptionRU", "getStrDescriptionSE", "getStrDivision", "getStrFacebook", "getStrGender", "getStrInstagram", "getStrKeywords", "getStrLeague", "getStrLocked", "getStrManager", "getStrRSS", "getStrSport", "getStrStadium", "getStrStadiumDescription", "getStrStadiumLocation", "getStrStadiumThumb", "getStrTeam", "getStrTeamBadge", "getStrTeamBanner", "getStrTeamFanart1", "getStrTeamFanart2", "getStrTeamFanart3", "getStrTeamFanart4", "getStrTeamJersey", "getStrTeamLogo", "getStrTeamShort", "getStrTwitter", "getStrWebsite", "getStrYoutube", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getFormedYear", "hashCode", "", "toString", "app_debug"})
public final class Team {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idLeague;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idTeam;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idSoccerXML = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intFormedYear = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intLoved = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String intStadiumCapacity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strAlternate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strCountry = null;
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
    private final java.lang.String strDivision = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strFacebook = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strGender = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strInstagram = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strKeywords = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strLeague = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strLocked = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strManager = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strRSS = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strSport = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strStadium = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strStadiumDescription = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strStadiumLocation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strStadiumThumb = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeam = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamBadge = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamBanner = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamFanart1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamFanart2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamFanart3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamFanart4 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamJersey = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamLogo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTeamShort = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strTwitter = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strWebsite = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strYoutube = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormedYear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdLeague() {
        return null;
    }
    
    public final void setIdLeague(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdTeam() {
        return null;
    }
    
    public final void setIdTeam(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdSoccerXML() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntFormedYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntLoved() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIntStadiumCapacity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrAlternate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrCountry() {
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
    public final java.lang.String getStrDivision() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrFacebook() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrInstagram() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrKeywords() {
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
    public final java.lang.String getStrManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrRSS() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrSport() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrStadium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrStadiumDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrStadiumLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrStadiumThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamBadge() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamFanart1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamFanart2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamFanart3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamFanart4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamJersey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTeamShort() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrTwitter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrWebsite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrYoutube() {
        return null;
    }
    
    public Team(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idLeague")
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idTeam")
    java.lang.String idTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idSoccerXML")
    java.lang.String idSoccerXML, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intFormedYear")
    java.lang.String intFormedYear, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intLoved")
    java.lang.String intLoved, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intStadiumCapacity")
    java.lang.String intStadiumCapacity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAlternate")
    java.lang.String strAlternate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCountry")
    java.lang.String strCountry, @org.jetbrains.annotations.Nullable()
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
    @com.squareup.moshi.Json(name = "strDivision")
    java.lang.String strDivision, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFacebook")
    java.lang.String strFacebook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strGender")
    java.lang.String strGender, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strInstagram")
    java.lang.String strInstagram, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strKeywords")
    java.lang.String strKeywords, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLeague")
    java.lang.String strLeague, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLocked")
    java.lang.String strLocked, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strManager")
    java.lang.String strManager, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strRSS")
    java.lang.String strRSS, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSport")
    java.lang.String strSport, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadium")
    java.lang.String strStadium, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadiumDescription")
    java.lang.String strStadiumDescription, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadiumLocation")
    java.lang.String strStadiumLocation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadiumThumb")
    java.lang.String strStadiumThumb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeam")
    java.lang.String strTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamBadge")
    java.lang.String strTeamBadge, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamBanner")
    java.lang.String strTeamBanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart1")
    java.lang.String strTeamFanart1, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart2")
    java.lang.String strTeamFanart2, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart3")
    java.lang.String strTeamFanart3, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart4")
    java.lang.String strTeamFanart4, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamJersey")
    java.lang.String strTeamJersey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamLogo")
    java.lang.String strTeamLogo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamShort")
    java.lang.String strTeamShort, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTwitter")
    java.lang.String strTwitter, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWebsite")
    java.lang.String strWebsite, @org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rifqimfahmi.foorballapps.models.Team copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idLeague")
    java.lang.String idLeague, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idTeam")
    java.lang.String idTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "idSoccerXML")
    java.lang.String idSoccerXML, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intFormedYear")
    java.lang.String intFormedYear, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intLoved")
    java.lang.String intLoved, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "intStadiumCapacity")
    java.lang.String intStadiumCapacity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strAlternate")
    java.lang.String strAlternate, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strCountry")
    java.lang.String strCountry, @org.jetbrains.annotations.Nullable()
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
    @com.squareup.moshi.Json(name = "strDivision")
    java.lang.String strDivision, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strFacebook")
    java.lang.String strFacebook, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strGender")
    java.lang.String strGender, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strInstagram")
    java.lang.String strInstagram, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strKeywords")
    java.lang.String strKeywords, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLeague")
    java.lang.String strLeague, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strLocked")
    java.lang.String strLocked, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strManager")
    java.lang.String strManager, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strRSS")
    java.lang.String strRSS, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strSport")
    java.lang.String strSport, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadium")
    java.lang.String strStadium, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadiumDescription")
    java.lang.String strStadiumDescription, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadiumLocation")
    java.lang.String strStadiumLocation, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strStadiumThumb")
    java.lang.String strStadiumThumb, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeam")
    java.lang.String strTeam, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamBadge")
    java.lang.String strTeamBadge, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamBanner")
    java.lang.String strTeamBanner, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart1")
    java.lang.String strTeamFanart1, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart2")
    java.lang.String strTeamFanart2, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart3")
    java.lang.String strTeamFanart3, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamFanart4")
    java.lang.String strTeamFanart4, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamJersey")
    java.lang.String strTeamJersey, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamLogo")
    java.lang.String strTeamLogo, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTeamShort")
    java.lang.String strTeamShort, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strTwitter")
    java.lang.String strTwitter, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "strWebsite")
    java.lang.String strWebsite, @org.jetbrains.annotations.Nullable()
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