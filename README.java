 double[] x_values = { 120,180,240 };
         double[] y_values = { l1,l2,l3};

                 if (x_values.length == y_values.length)
                 {
                 for (int i = 0; i < (x_values.length - 1); i++) {
                    double y_2 = y_values[i + 1];
                    double y_1 = y_values[i];

                    double delta_y = y_2 - y_1;

                    double x_2 = x_values[i + 1];
                    double x_1 = x_values[i];

                    double delta_x = x_2 - x_1;

                    slope += delta_y / delta_x;
                }
                 }
              double slope_val= slope / (x_values.length-1);
