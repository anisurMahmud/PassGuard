package com.example.PassGuard.service.Interface;

import org.jasypt.util.text.AES256TextEncryptor;

public interface EncryptionConfig_Interface {
    AES256TextEncryptor aes256TextEncryptor();
}
