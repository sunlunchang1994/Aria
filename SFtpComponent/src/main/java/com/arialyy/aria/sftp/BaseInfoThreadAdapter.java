/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.aria.sftp;

import com.arialyy.aria.core.wrapper.AbsTaskWrapper;
import java.util.Vector;

/**
 * sftp文件信息适配器
 */
public abstract class BaseInfoThreadAdapter<WRAPPER extends AbsTaskWrapper> {

  private WRAPPER mWrapper;

  public BaseInfoThreadAdapter(WRAPPER taskWrapper) {
    mWrapper = taskWrapper;
  }

  public WRAPPER getWrapper() {
    return mWrapper;
  }

  /**
   * 处理文件
   *
   * @return true 处理文件成功，false 处理文件失败，结束任务
   */
  protected abstract boolean handlerFile(Vector vector);
}
