package com.jcloudify.demo.file.hash;

import com.jcloudify.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
