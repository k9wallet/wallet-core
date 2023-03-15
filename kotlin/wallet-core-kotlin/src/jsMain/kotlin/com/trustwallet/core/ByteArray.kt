// Copyright © 2017-2023 Trust Wallet.
//
// This file is part of Trust. The full Trust copyright notice, including
// terms governing use, modification, and redistribution, is contained in the
// file LICENSE at the root of the source code distribution tree.

package com.trustwallet.core

import org.khronos.webgl.Int8Array
import org.khronos.webgl.Uint8Array

internal typealias UInt8Array = Uint8Array

fun Int8Array.asByteArray(): ByteArray =
    unsafeCast<ByteArray>()

fun Uint8Array.asByteArray(): ByteArray =
    Int8Array(buffer, byteOffset, length).asByteArray()

fun ByteArray.asInt8Array(): Int8Array =
    unsafeCast<Int8Array>()

fun ByteArray.asUInt8Array(): Uint8Array =
    asInt8Array().let { Uint8Array(it.buffer, it.byteOffset, it.length) }
