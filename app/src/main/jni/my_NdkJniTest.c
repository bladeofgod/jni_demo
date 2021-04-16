//
// Created by Admin on 2021/4/16.
//

#include "my_NkdJniTest.h"

JNIEXPORT jstring JNICALL Java_my_NkdJniTest_myTest
  (JNIEnv *, jobject) {
    return (*env)->NewStringUTF(env,"this is my test");
}
