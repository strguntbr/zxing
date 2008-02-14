/*
 * Copyright 2007 Google Inc.
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

package com.google.zxing;

/**
 * <p>Encapsulates the result of decoding a barcode within an image.</p>
 *
 * @author srowen@google.com (Sean Owen)
 */
public final class Result {

  private final String text;
  private final ResultPoint[] resultPoints;

  public Result(String text, ResultPoint[] resultPoints) {
    this.text = text;
    this.resultPoints = resultPoints;
  }

  /**
   * @return raw text encoded by the barcode, if any
   */
  public String getText() {
    return text;
  }

  /**
   * @return points related to the barcode in the image. These are typically points
   *         identifying finder patterns or the corners of the barcode. The exact meaning is
   *         specific to the type of barcode that was decoded.
   */
  public ResultPoint[] getResultPoints() {
    return resultPoints;
  }

}
